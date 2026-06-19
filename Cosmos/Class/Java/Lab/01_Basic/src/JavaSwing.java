import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaSwing {
    public static void main(String[] main){
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400,200);
        frame.setLayout(new GridLayout(5,2));

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        menuBar.add(file);
        frame.setJMenuBar(menuBar);
        JMenuItem n = new JMenuItem("New");
        file.add(n);

        JRadioButton m = new JRadioButton("Male");
        frame.add(m);
        JRadioButton f = new JRadioButton("Female");
        frame.add(f);

        ButtonGroup grp = new ButtonGroup();
        grp.add(m);
        grp.add(f);

        JLabel numLabel = new JLabel("Number 1: ");
        frame.add(numLabel);
        JTextField num1 = new JTextField("Enter 1st number");
        num1.setToolTipText("Enter 1st number");
        num1.setFont(new Font("Courier New",Font.PLAIN, 18));
        frame.add(num1);

        JLabel num2Label = new JLabel("Number 2: ");
        frame.add(num2Label);
        JTextField num2 = new JTextField("Enter 2nd number");
        num2.setFont(new Font("Courier New",Font.PLAIN, 18));
        frame.add(num2);

        JLabel result = new JLabel("Result: ");
        frame.add(result);
        JTextField resultT = new JTextField("Result");
        resultT.setEditable(false);
        resultT.setFont(new Font("Courier New",Font.PLAIN, 18));
        frame.add(resultT);

        JButton sum = new JButton("+");
        frame.add(sum);

        sum.addActionListener(e->{
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            int resultSum = n1 + n2;
            resultT.setText(String.valueOf(resultSum));
        });

        frame.setVisible(true);
    }

}
