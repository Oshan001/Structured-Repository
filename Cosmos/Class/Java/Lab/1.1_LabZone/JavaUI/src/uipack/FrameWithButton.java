package uipack;

import javax.swing.*;
import java.awt.*;

public class FrameWithButton {
    public static void main(String[] args){
        JFrame frame = new JFrame("Frame Buttons");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50,20));
        frame.setExtendedState(JFrame.NORMAL);

        JLabel header = new JLabel("Frame Buttons");
        frame.add(header);
        header.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
        header.setForeground(Color.GRAY);

        // Creating Buttons
        JButton clickMeButton = new JButton("Click Me");
        JButton exitButton = new JButton("Exit");

        // Customizing buttons
        clickMeButton.setForeground(Color.CYAN); // Text-color
        clickMeButton.setBackground(Color.BLACK); // Backgroun-color

        clickMeButton.setFont(new Font("Chalkboard SE", Font.BOLD, 16)); // Font style

        clickMeButton.setOpaque(true);
        clickMeButton.setBorderPainted(false); // Disable default borders
        clickMeButton.setFocusPainted(false); // Disable the blue border shown when the button is focused (keyboard/mouse highlight)

        clickMeButton.setToolTipText("Click Me");


        exitButton.setForeground(Color.RED);
        exitButton.setBackground(Color.WHITE);

        exitButton.setFont(new Font("Chalkboard SE", Font.BOLD, 16));

        exitButton.setOpaque(true);
        exitButton.setBorderPainted(false);
        exitButton.setFocusPainted(false); // Disable the blue border shown when the button is focused (keyboard/mouse highlight)

        exitButton.setToolTipText("Exit");

        // Adding buttons to the frame
        frame.add(clickMeButton);
        frame.add(exitButton);

        frame.setVisible(true);
    }
}
