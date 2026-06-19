package uipack;

import javax.swing.*; // Importing Swing package to use JFrame and other UI components
import java.awt.*;

public class FrameOnly {
    public static void main(String[] args) {
        // Creating a JFrame object with a title "This is a test"
        JFrame frame = new JFrame("This is a test");

        // Setting the width and height of the frame (in pixels)
        frame.setSize(400, 200);

        /*
         * Specifying the behavior when the user clicks the close (X) button.
         * By default, clicking the close button hides the frame.
         * EXIT_ON_CLOSE is a static constant from the JFrame class.
         * It tells the program to exit the application when the frame is closed.
         * Since it's static, we access it via the class name JFrame.EXIT_ON_CLOSE instead of through object.
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         * Centers the frame on the screen.
         * Passing 'null' tells Java to position the frame relative to the center of the screen,
         * regardless of any other windows or components.
         */
        frame.setLocationRelativeTo(null);

        /*
         * Setting the layout manager of the frame to FlowLayout.
         * FlowLayout arranges components in a left-to-right flow, much like words in a sentence.
         * When there’s no more horizontal space, components automatically move to the next line.
         * It’s simple and useful for small UIs where components can wrap neatly.
         * By default, FlowLayout centers components, but alignment and spacing can be customized.
         *  frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,10)); // left aligned, 20px horiz gap, 10px vert gap
         * Other Layouts: BorderLayout(Default), GridLayout
         */
        frame.setLayout(new FlowLayout());

        /*
         * Sets the frame state to NORMAL, which means it will appear in its default size and position.
         * This ensures the window is neither minimized nor maximized.
         * Useful if you want to explicitly reset the frame state.
         * - JFrame.ICONIFIED -> Minimized window (like clicking the minimize button).
         * - JFrame.MAXIMIZED_HORTZ -> Maximize Horizontally (Width).
         * - JFrame.MAXIMIZED_VERT -> Maximize Vertically (Height)
         * - JFrame.MAXIMIZED_BOTH -> Maximize both horizontally and vertically (fills the screen).
         */
        frame.setExtendedState(JFrame.NORMAL);

        /*
         * By default, the frame is not visible.
         * This method makes the frame appear on the screen.
         */
        frame.setVisible(true);
    }
}