import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.util.List;

public class TicTacToe {
    public static class game extends JFrame implements ActionListener {
        JButton a, b, c, d, e, f, g, h, i;
        JButton[] button;

        game() {
            a = new JButton("");
            b = new JButton("");
            c = new JButton("");
            d = new JButton("");
            e = new JButton("");
            f = new JButton("");
            g = new JButton("");
            h = new JButton("");
            i = new JButton("");
            button = new JButton[]{a, b, c, d, e, f, g, h, i};
            for (JButton Btn : button) {
                Btn.addActionListener(this);
                setLayout(new GridLayout(3, 3));
                add(Btn);
            }
            setSize(200, 400);
            setTitle("RED:🔴:BOT   \t\tBLUE:🔵:YOU");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            for (JButton bu : button) {
                if (e.getSource() == bu) {
                    bu.setBackground(Color.BLUE);
                    bu.setEnabled(false);

                    if (isWin(Color.BLUE)) {
                        JOptionPane.showMessageDialog(this, "🏆 YOU WIN 🏆");
                        return;//player Win Condition
                    } else if (isTie()) {
                        JOptionPane.showMessageDialog(this, "🫱🏿‍🫲🏼 GAME  DRAW 🫱🏿‍🫲🏼");
                        return;//tie condition
                    }

                    bot();
                    if (isWin(Color.RED)) {
                        JOptionPane.showMessageDialog(this, "❌ YOU LOOSE ❌" + "\n" + "👏 GOOD TRY 👏");
                        return;//bot Win Condition
                    } else if (isTie()) {
                        JOptionPane.showMessageDialog(this, "🫱🏿‍🫲🏼 GAME  DRAW 🫱🏿‍🫲🏼");
                        return;//tie condition
                    }
                }
            }
        }

        private boolean isWin(Color c) {
            //horizontal
            if (button[0].getBackground() == c && button[1].getBackground() == c && button[2].getBackground() == c)
                return true;
            if (button[3].getBackground() == c && button[4].getBackground() == c && button[5].getBackground() == c)
                return true;
            if (button[6].getBackground() == c && button[7].getBackground() == c && button[8].getBackground() == c)
                return true;
            //vertical
            if (button[0].getBackground() == c && button[3].getBackground() == c && button[6].getBackground() == c)
                return true;
            if (button[1].getBackground() == c && button[4].getBackground() == c && button[7].getBackground() == c)
                return true;
            if (button[2].getBackground() == c && button[5].getBackground() == c && button[8].getBackground() == c)
                return true;
            //Diagonal
            if (button[0].getBackground() == c && button[4].getBackground() == c && button[8].getBackground() == c)
                return true;
            return button[6].getBackground() == c && button[4].getBackground() == c && button[2].getBackground() == c;
        }

        private boolean isTie() {
            for (JButton but : button) {
                if (but.isEnabled()) return false;
            }
            return true;
        }

        private void bot() {
            Random r = new Random();
            List<JButton> selected = new ArrayList<>();
            for (JButton but : button) {
                if (but.isEnabled()) {
                    selected.add(but);
                }
            }
            if (selected.isEmpty()) return;
            int index = r.nextInt(selected.size());
            JButton choose = selected.get(index);
            choose.setBackground(Color.RED);
            choose.setEnabled(false);
            // Tie condn if (selected.isEmpty()) { JOptionPane.showMessageDialog(this,"TIE"); return; }
        }
    }

    public static void main(String[] args) {
        new game();
    }
}







