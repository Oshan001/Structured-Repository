package packUDP;

import java.net.*;  // Needed for networking classes like DatagramSocket, DatagramPacket, InetAddress

class Sender_Client_UDP {
    public static void main(String[] args) throws Exception {

        // Step 1: Create a DatagramSocket (like a sending door)
        // This socket is used to send data from this program to another device or program
        DatagramSocket socket = new DatagramSocket();

        // Step 2: Prepare the message you want to send
        String msg = "Hello from UDP client";

        // Step 3: Convert the message string into bytes
        // UDP sends data in byte form, not as text
        byte[] buffer = msg.getBytes();

        // Step 4: Get the IP address of the receiver
        // "localhost" means this same computer (used when both sender and receiver are running here)
        InetAddress receiverAddress = InetAddress.getByName("localhost");

        // Step 5: Create the DatagramPacket
        // This packet contains the data to send (buffer), its length,
        // the destination IP address, and the destination port number (e.g., 1234)
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiverAddress, 1234);

        // Step 6: Send the packet through the socket
        // This throws the message out of your sending door toward the receiver
        socket.send(packet);

        // Step 7: Close the socket once done
        // This is like closing the door after sending the message
        socket.close();
    }
}