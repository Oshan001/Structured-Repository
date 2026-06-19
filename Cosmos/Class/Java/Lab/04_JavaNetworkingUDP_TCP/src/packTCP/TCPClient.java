package packTCP;

import java.io.*;      // For stream handling
import java.net.*;     // For Socket

public class TCPClient {
    public static void main(String[] args) throws Exception {

        // Step 1: Connect to server on localhost and port 1234
        Socket socket = new Socket("localhost", 1234);
        System.out.println("Connected to server!");

        // Step 2: Prepare to send message to server
        OutputStream output = socket.getOutputStream(); // Get output stream
        PrintWriter writer = new PrintWriter(output, true); // Wrap for easy text sending

        // Step 3: Prepare to receive reply from server
        InputStream input = socket.getInputStream(); // Get input stream from server
        BufferedReader reader = new BufferedReader(new InputStreamReader(input)); // Wrap for reading text

        // Step 4: Send message to server
        String messageToServer = "Hello from Client!"; // Message you want to send
        writer.println(messageToServer); // Sends message with newline

        // Step 5: Read server's response
        String replyFromServer = reader.readLine(); // Blocks and waits for reply
        System.out.println("Received from server: " + replyFromServer);

        // Step 6: Close everything nicely
        writer.close();
        reader.close();
        socket.close();
    }
}