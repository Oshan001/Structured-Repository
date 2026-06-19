import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.util.List;

public class tic {
    public static class game extends JFrame implements ActionListener {
        JButton a, b, c, d, e, f, g, h, i;
        int win = 0, Loose = 0, Tie = 0, O;
        Font F = new Font("Arial", Font.BOLD, 40);
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
            setLayout(new GridLayout(3, 3));
            for (JButton Btn : button) {
                Btn.addActionListener(this);
                Btn.setFont(F);
                add(Btn);
            }
            setSize(400, 400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("TIC_TAC_TOE|" + "WIN:" + win + "|Loose" + Loose + "|Tie:" + Tie);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            for (JButton bu : button) {
                if (e.getSource() == bu) {
                    bu.setText("O");//it show ...
                    bu.setForeground(Color.BLUE);
                    bu.setEnabled(false);

                    if (isWin(Color.BLUE)) {
                        win++;
                        setTitle("TIC_TAC_TOE|" + "WIN:" + win + "|Loose" + Loose + "|Tie:" + Tie);
                        O = JOptionPane.showConfirmDialog(this, "🏆 YOU WIN 🏆\n", "👏 GOOD GAME 👏 \nDO YOU WANT TO PLAY AGAIN?\n GAME OVER", JOptionPane.YES_NO_OPTION);
                        if (O == JOptionPane.YES_OPTION) reset();
                        else System.exit(0);
                        return;//player Win Condition
                    } else if (isTie()) {
                        Tie++;
                        setTitle("TIC_TAC_TOE|" + "WIN:" + win + "|Loose" + Loose + "|Tie:" + Tie);
                        O = JOptionPane.showConfirmDialog(this, "🫱🏿‍🫲🏼 GAME  DRAW 🫱🏿‍🫲🏼", "👏 GOOD GAME 👏 \nDO YOU WANT TO PLAY AGAIN?\nGAME OVER", JOptionPane.YES_NO_OPTION);
                        if (O == JOptionPane.YES_OPTION) reset();
                        else System.exit(0);
                        return;//tie condition
                    }

                    bot();
                    if (isWin(Color.RED)) {
                        Loose++;
                        setTitle("TIC_TAC_TOE|" + "WIN:" + win + "|Loose" + Loose + "|Tie:" + Tie);
                        O = JOptionPane.showConfirmDialog(this, "❌ YOU LOOSE ❌ \n", "👏 GOOD TRY 👏 \nWANT TO RETRY? " + "\nGAME OVER", JOptionPane.YES_NO_OPTION);
                        if (O == JOptionPane.YES_OPTION) reset();
                        else System.exit(0);
                        return;//bot Win Condition
                    } else if (isTie()) {
                        Tie++;
                        setTitle("TIC_TAC_TOE|" + "WIN:" + win + "|Loose" + Loose + "|Tie:" + Tie);
                        O = JOptionPane.showConfirmDialog(this, "🫱🏿‍🫲🏼 GAME  DRAW 🫱🏿‍🫲🏼" + "\n" + "👏 GOOD GAME", " 👏\n DO YOU WANT TO PLAY AGAIN?" + "\nGAME OVER", JOptionPane.YES_NO_OPTION);
                        if (O == JOptionPane.YES_OPTION) reset();
                        else System.exit(0);
                        return;//tie condition
                    }
                }
            }
        }

        private void reset() {
            for (JButton bu : button) {
                bu.setText("");
                bu.setEnabled(true);
                bu.setForeground(Color.BLACK);
            }
        }

        private boolean isWin(Color c) {
            //horizontal
            if (button[0].getForeground() == c && button[1].getForeground() == c && button[2].getForeground() == c)
                return true;
            if (button[3].getForeground() == c && button[4].getForeground() == c && button[5].getForeground() == c)
                return true;
            if (button[6].getForeground() == c && button[7].getForeground() == c && button[8].getForeground() == c)
                return true;
            //vertical
            if (button[0].getForeground() == c && button[3].getForeground() == c && button[6].getForeground() == c)
                return true;
            if (button[1].getForeground() == c && button[4].getForeground() == c && button[7].getForeground() == c)
                return true;
            if (button[2].getForeground() == c && button[5].getForeground() == c && button[8].getForeground() == c)
                return true;
            //Diagonal
            if (button[0].getForeground() == c && button[4].getForeground() == c && button[8].getForeground() == c)
                return true;
            if (button[6].getForeground() == c && button[4].getForeground() == c && button[2].getForeground() == c)
                return true;
            return false;
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
            choose.setText("X");
            choose.setForeground(Color.RED);
            choose.setEnabled(false);
            // Tie condn if (selected.isEmpty()) { JOptionPane.showMessageDialog(this,"TIE"); return; }
        }
    }

    public static void main(String[] args) {
        new game();
    }
}







