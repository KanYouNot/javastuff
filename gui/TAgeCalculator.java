import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class TAgeCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AGE CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setLayout(new FlowLayout());

        JLabel instruction = new JLabel("Enter your age:");
        JTextField input = new JTextField(10);
        JLabel out = new JLabel("");

        frame.add(instruction);
        frame.add(input);
        frame.add(out);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int uInput = Integer.parseInt(input.getText());
                    out.setText("Calculating...");

                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            SwingUtilities.invokeLater(() -> {
                            Random random = new Random();
                            if (random.nextBoolean()) {
                                out.setText("Your age is: " + uInput);
                            } else {
                                out.setText("Hello world!");
                            }
                          });
                        }
                    }, 5000);
                } catch (NumberFormatException ex) {
                    out.setText("Please enter a valid number!");
                }
            }
        });

        frame.setVisible(true);
    }
}

