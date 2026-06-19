package uipack;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class FrameWithDifferentFields {
    public static void main(String[] args) {
        // --- Frame Setup ---

        // Create a new JFrame with a title
        JFrame frame = new JFrame("Login Frame");

        // Set the initial size of the frame (width x height)
        frame.setSize(500, 200);

        // Exit the program when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Set layout to a grid: 6 rows, 2 columns, 10px gap horizontally and vertically
        frame.setLayout(new GridLayout(6, 2, 10, 10));

        // Set frame to normal state (not maximized or minimized)
        frame.setExtendedState(JFrame.NORMAL);

        // --- Username Field ---

        // Create a label for the username
        JLabel label = new JLabel("Username: ");

        // Create a text field with a width of 10 columns
        JTextField textField = new JTextField(10);

        // Add the username label and text field to the frame
        frame.add(label);
        frame.add(textField);

        // Set a tooltip to guide the user
        textField.setToolTipText("Enter your username");

        // --- Password Field ---

        // Create a label for the password field
        JLabel label1 = new JLabel("Password: ");

        // Create a password field with a width of 10 columns
        JPasswordField passwordField = new JPasswordField(10);

        // Add password label and field to the frame
        frame.add(label1);
        frame.add(passwordField);

        // Mask the characters in the password field using '*'
        passwordField.setEchoChar('*');

        // Set tooltip for guidance
        passwordField.setToolTipText("Enter your password");

        // --- Comment Field (Multiline Text) ---

        // Create a label for the comment
        JLabel label2 = new JLabel("Comment: ");

        // Create a multiline text area for user comments
        JTextArea textArea = new JTextArea();

        // Enable line wrapping so text wraps automatically to the next line
        textArea.setLineWrap(true);

        // Wrap at word boundaries for better readability
        textArea.setWrapStyleWord(true);

        // Add label to the frame
        frame.add(label2);

        // Wrap the text area inside a scroll pane in case the text overflows
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add scrollable text area to the frame
        frame.add(scrollPane);
        //frame.add(textArea);

        // --- Formatted Number Field ---

        // Create a label for the formatted number input
        JLabel label3 = new JLabel("Formatted Number Field: ");

        // Create a formatted text field that accepts integers (e.g., 1,000)
        JFormattedTextField formattedTextField = new JFormattedTextField(NumberFormat.getIntegerInstance());

        // Add label and formatted field to the frame
        frame.add(label3);
        frame.add(formattedTextField);

        // --- ComboBox (Dropdown Menu) ---

        // Create a label for the dropdown
        JLabel label4 = new JLabel("Are you Human?? ");

        // Create a combo box with Yes/No options
        String[] options = {"Yes", "No"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Add label and combo box to the frame
        frame.add(label4);
        frame.add(comboBox);

        // --- Login Button ---

        // Create a login button
        JButton button = new JButton("Login");

        // Tooltip to guide the user on hover
        button.setToolTipText("Click to login");

        // Add the login button to the frame
        frame.add(button);

        // Add an empty label to fill the remaining grid cell
        // This keeps the layout balanced and aligns the button properly
        frame.add(new JLabel());

        // --- Final Step ---

        // Make the frame visible after all components are added
        frame.setVisible(true);
    }
}