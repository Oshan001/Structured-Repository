package uipack;

import javax.swing.*;
import java.awt.*;

public class FrameWithRadioAndCheckbox {
    public static void main(String[] args) {
        // --- Create and configure the main frame ---
        JFrame frame = new JFrame("Radio Checkbox"); // Frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit app when closed
        frame.setSize(500, 300); // Set initial size of the frame
        frame.setLocationRelativeTo(null); // Center the frame on screen
        frame.setExtendedState(JFrame.NORMAL); // Open frame in normal state
        frame.setLayout(new GridLayout(13, 1)); // Use a vertical grid layout with 13 rows and 1 column
        frame.setResizable(false); // Preventing window resizing

        // --- Gender Selection (Radio Buttons) ---

        JLabel genderLabel = new JLabel("Select Gender: "); // Label for gender selection
        genderLabel.setFont(new Font("Chalkduster", Font.BOLD, 16)); // Set custom font for the label
        genderLabel.setToolTipText("Choose your gender"); // Tooltip (on hover) text for guidance

        JRadioButton male = new JRadioButton("Male"); // Option: Male
        male.setFont(new Font("Chalkduster", Font.PLAIN, 14)); // Set font for radio button
        male.setToolTipText("Select if you are male");

        JRadioButton female = new JRadioButton("Female"); // Option: Female
        female.setFont(new Font("Chalkduster", Font.PLAIN, 14)); // Set font for radio button
        female.setToolTipText("Select if you are female");

        JRadioButton other = new JRadioButton("Other"); // Option: Other
        other.setFont(new Font("Chalkduster", Font.PLAIN, 14)); // Set font for radio button
        other.setToolTipText("Select if your gender is not listed");

        ButtonGroup genderGroup = new ButtonGroup(); // Group radio buttons so only one can be selected
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        // Add gender components to the frame
        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);
        frame.add(other);
        male.setSelected(true); // Set this radio button as selected by default

        // --- Hobbies Selection (Checkboxes) ---

        JLabel hobbiesLabel = new JLabel("Select Hobbies: "); // Label for hobbies selection
        hobbiesLabel.setFont(new Font("Chalkduster", Font.BOLD, 16)); // Set custom font for the label
        hobbiesLabel.setToolTipText("You can choose more than one hobby");

        JCheckBox music = new JCheckBox("Music"); // Option: Music
        music.setFont(new Font("Chalkduster", Font.PLAIN, 14)); // Set font for checkbox
        music.setToolTipText("Check if you like music");

        JCheckBox travelling = new JCheckBox("Travelling"); // Option: Travelling
        travelling.setFont(new Font("Chalkduster", Font.PLAIN, 14)); // Set font for checkbox
        travelling.setToolTipText("Check if you enjoy travelling");

        JCheckBox reading = new JCheckBox("Reading"); // Option: Reading
        reading.setFont(new Font("Chalkduster", Font.PLAIN, 14)); // Set font for checkbox
        reading.setToolTipText("Check if you love reading");

        // Add hobby components to the frame
        frame.add(hobbiesLabel);
        frame.add(music);
        frame.add(travelling);
        frame.add(reading);

        // --- Submit Button ---
        JButton submit = new JButton("Submit"); // Create a submit button
        frame.add(submit); // Add the button to the frame
        submit.setToolTipText("Click to submit your choices");

        // --- Display the frame ---
        frame.setVisible(true); // Make the frame visible
    }
}