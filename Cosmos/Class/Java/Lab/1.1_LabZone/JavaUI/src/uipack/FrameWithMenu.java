package uipack;

import javax.swing.*;

public class FrameWithMenu extends JFrame{

        FrameWithMenu() {
            // Frame settings
            setTitle("Menu Demo");
            setSize(400, 300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            // Create the menu bar
            JMenuBar menuBar = new JMenuBar();

            // Create Menus
            JMenu fileMenu = new JMenu("File");
            JMenu editMenu = new JMenu("Edit");

            // Create Menu Items
            JMenuItem newItem = new JMenuItem("New");
            JMenuItem openItem = new JMenuItem("Open");
            JMenuItem exitItem = new JMenuItem("Exit");

            // Add items to the File menu
            fileMenu.add(newItem);
            fileMenu.add(openItem);
            fileMenu.addSeparator(); // Adds a separator line
            fileMenu.add(exitItem);

            // Add Menus to the Menu Bar
            menuBar.add(fileMenu);
            menuBar.add(editMenu);

            // Set the menu bar to the frame
            setJMenuBar(menuBar);

            /*
            Adding an ActionListener to the "Exit" menu item using a lambda expression ( i.e., -> )
            This lambda expression replaces the need for an anonymous inner class
            and provides a shorter, more readable way to handle the event.

            Lambda expressions in Java can only be used with functional interfaces.
            A functional interface is an interface that contains exactly one abstract method.
            In this case, ActionListener is a functional interface with a single method:
            void actionPerformed(ActionEvent e)

             Syntax of the lambda used here:
                (e) -> System.exit(0)
            - 'e' is the ActionEvent object passed when the menu item is clicked
            - 'System.exit(0)' is the body that executes, which immediately terminates the application

            This approach simplifies the code and is preferred when the event handling logic is simple and short.
            */
            exitItem.addActionListener(e -> {
                System.exit(0);
            }); // exitItem.addActionListener(e -> System.exit(0)); - for only one statement




            // Final setup
            setVisible(true);
        }

        public static void main(String[] args) {
            new FrameWithMenu();
        }
    }
