import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Guessing extends JFrame {
    JTextField jta = new JTextField(10);
    JButton button = new JButton("Guess");
    int trys = 3;

    Guessing() {
        super("Guessing");

        Random rand = new Random();
        int num = rand.nextInt(21);
        setLayout(new FlowLayout());
        setSize(500, 250);

        add(new JLabel("I made a number from 0 to 20, try to guess"));

        add(jta);
        add(button);

        button.addActionListener(ae -> {
            try {
                int x1 = Integer.parseInt(jta.getText().trim());
                if (trys > 0) {
                    trys--;
                    if (x1 != num) {
                        if (x1 > num) {
                            JOptionPane.showMessageDialog(null, "You did not guess, the hidden number is less than the entered one. There are still attempts left: " + trys, "Result", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "You did not guess, the hidden number is greater than the entered one. There are still attempts left: " + trys, "Result", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You guessed it! Congratulations! Let's try again", "Result", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new Guessing();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You have not guessed the number and you have no attempts left. I'm sorry, but you lost. Let's start over", "Result", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new Guessing();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error in Number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        setVisible(true);
    }


    public static void main(String[] args) {
        new Guessing();
    }
}