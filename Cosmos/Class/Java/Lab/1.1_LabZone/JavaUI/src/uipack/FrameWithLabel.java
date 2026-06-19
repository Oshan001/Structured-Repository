package uipack;

import javax.swing.*; // For JFrame, JLabel etc...
import javax.swing.border.Border;
import java.awt.*; // For layout mangers, colors, fonts

public class FrameWithLabel {
    public static void main(String[] args){
        JFrame frame = new JFrame("Frame with Label");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        frame.setExtendedState(JFrame.NORMAL);
        // frame.setVisible(true); * Call it at last after adding all components otherwise components won't be displayed properly

        /*
         * Creating the first label with text "Java"
         * Customizing the font to Courier New, bold, size 20
         * Setting text color to blue
         */
        JLabel label1 = new JLabel("Java");
        label1.setFont(new Font("Courier New", Font.BOLD, 20));
        label1.setForeground(Color.blue);
        frame.add(label1); // Adding label to the frame

        /*
         * Creating the first label with text " is Funnnn!!"
         * Using plain style font, similar size, and default black color
         * It will be placed next to the first label since FlowLayout flows left to right
         */
        JLabel label2 = new JLabel(" is Funnnn!!");
        label2.setFont(new Font("Courier New", Font.PLAIN, 16));
        frame.add(label2); // Adding label to the frame

        /*
         * IMPORTANT: Always add all components (like JLabel, JButton, etc.)
         * BEFORE calling setVisible(true).
         * If you call setVisible(true) first, added components may not display properly
         * because the frame has already been rendered.
         */
        frame.setVisible(true); // Make frame visible after all setup
    }
}
