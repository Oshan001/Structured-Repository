package packTCP;

import java.io.*;      // For handling input/output streams
import java.net.*;     // For networking classes like ServerSocket and Socket

public class TCPServer {
    public static void main(String[] args) throws Exception {

        // Create a ServerSocket on port 1234
        // This opens a "gate" and waits for clients to connect
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Waiting for client...");  // Just to show it's waiting

        // Accept a connection from a client (blocking call)
        // This line pauses and waits until a client connects
        Socket socket = serverSocket.accept();  // After connection, returns the client socket
        System.out.println("Client connected!");  // Shows when client is connected

        // Create InputStream to receive data from the client
        // First get raw stream using socket.getInputStream()
        InputStream input = socket.getInputStream();

        // Then wrap it in InputStreamReader and BufferedReader to read text easily
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        // Prepare to send message to client
        OutputStream output = socket.getOutputStream(); // Get raw output stream to client
        PrintWriter writer = new PrintWriter(output, true); // Wrap it to send text easily (auto-flush true)

        // Read a line of text sent by the client (until newline \n is received)
        String message = reader.readLine();

        // Show the received message on the server side
        System.out.println("Received from client: " + message);

        // Send reply back to client
        String reply = "Hello from Server!"; // You can modify this as needed
        writer.println(reply); // Sends the message with newline

        // Close everything — good habit!
        reader.close();         // Close reader first
        socket.close();         // Then close client socket
        serverSocket.close();   // Finally, close the server socket
    }
}