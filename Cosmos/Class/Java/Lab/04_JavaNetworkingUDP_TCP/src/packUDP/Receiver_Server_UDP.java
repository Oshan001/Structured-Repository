package packUDP;

import java.net.*; // Needed for networking classes: DatagramSocket, DatagramPacket

public class Receiver_Server_UDP {
    public static void main(String[] args) throws Exception {

        // Step 1: Create a DatagramSocket on port 1234
        // This is like opening a *receiving door* at port 1234,
        // waiting for someone to knock (send a message)
        DatagramSocket socket = new DatagramSocket(1234);

        // Step 2: Create a byte array buffer to hold incoming data
        // This is like an empty container (size 1024 bytes) where received data will be temporarily stored
        byte[] buffer = new byte[1024];

        // Step 3: Create a DatagramPacket to receive the data
        // This packet wraps the buffer so the socket can fill it with the incoming message
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // Step 4: Let the receiver wait for someone to send a packet
        // This line halts the program until a message is received
        System.out.println("📡 Waiting for packet...");
        socket.receive(packet); // It receives the message and fills the packet (and buffer)

        // Step 5: Extract the message from the received packet
        // Convert the bytes from the buffer into a readable String
        String received = new String(packet.getData(), 0, packet.getLength());

        // Step 6: Show the received message
        System.out.println("📩 Received: " + received);

        // Step 7: Close the socket
        // Done receiving, so we close the door (port 1234)
        socket.close();
    }
}