package uipack;

import javax.swing.*;              // For JFrame, JLabel, JButton, JOptionPane, etc.
import java.awt.*;                 // For layout managers, colors, fonts
import java.awt.event.*;          // For event handling like ActionListener

public class EventActionListener {
    public static void main(String[] args) {

        // --- Create and configure the main frame ---
        JFrame frame = new JFrame("Event Handling"); // Create the frame with a title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed
        frame.setSize(300, 200); // Set the initial size of the frame
        frame.setLayout(new GridLayout(2, 1)); // Use a GridLayout with 2 rows and 1 column
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // --- Create and configure the label ---
        JLabel label = new JLabel("Click here: "); // Label to guide the user
        label.setFont(new Font("Consolas", Font.BOLD, 30)); // Set font type, style, and size
        label.setForeground(Color.RED); // Set font color to red
        frame.add(label); // Add label to the frame

        // --- Create and configure the button ---
        JButton button = new JButton("Click Me"); // Create a button with label "Click Me"
        button.setFont(new Font("Consolas", Font.BOLD, 20)); // Set font for the button
        button.setForeground(Color.BLUE); // Set text color
        button.setBackground(Color.GRAY); // Set background color
        button.setOpaque(true); // Make background color visible
        button.setBorderPainted(false); // Remove default border for a cleaner look
        button.setFocusPainted(false); // Disable the blue border shown when the button is focused (keyboard/mouse highlight)
        frame.add(button); // Add button to the frame

        // --- Add action listener to the button ---
        // This is an anonymous inner class that defines what happens when the button is clicked
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display a dialog box when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clickedddd");
            }
        });

        // --- Make the frame visible ---
        frame.setVisible(true); // Always set this at the end after adding components
    }
}