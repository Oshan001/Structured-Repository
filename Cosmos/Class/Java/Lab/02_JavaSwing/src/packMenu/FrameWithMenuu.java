package packMenu;

import javax.swing.*;
import java.awt.event.*;

public class FrameWithMenuu {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame on screen

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu and add menu items
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem newItem = new JMenuItem("New");
        fileMenu.add(newItem);

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.addSeparator(); // Add a separator before Exit
        fileMenu.add(exitItem);

        // Create the "Help" menu
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        JMenuItem helpItem = new JMenuItem("Help");
        helpMenu.add(helpItem);

        // Set the menu bar on the frame
        frame.setJMenuBar(menuBar);

        // Action for "New" - shows a message dialog
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "New file created");
            }
        });

        // Action for "Open" - opens file chooser and shows selected file
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    String fileName = fileChooser.getSelectedFile().getName();
                    JOptionPane.showMessageDialog(frame, "Opened: " + fileName);
                }
            }
        });

        // Action for "Exit" - closes the application
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Action for "Help" - shows basic usage info
        helpItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "This is a basic menu example.\nUse File > New/Open/Exit as needed.");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}