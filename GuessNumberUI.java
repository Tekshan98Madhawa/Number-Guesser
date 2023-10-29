import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberUI extends JFrame {
    private JTextField numberField;
    private JButton submitButton;
    private JLabel messageLabel;

    public GuessNumberUI() {
        setTitle("Guess the Number Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        messageLabel = new JLabel("Please wait MF.");
        add(messageLabel);

        numberField = new JTextField(10);
        add(numberField);

        submitButton = new JButton("Submit");
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processGuess();
            }
        });
    }

    private void processGuess() {
        int guess = Integer.parseInt(numberField.getText());

        if (guess < systemNumber) {
            messageLabel.setText("Generated number is bigger");
        } else if (guess > systemNumber) {
            messageLabel.setText("Generated number is smaller");
        } else {
            messageLabel.setText("You won!");
            submitButton.setEnabled(false); // Disable the button after winning.
        }
    }

    public void setSystemNumber(int number) {
        systemNumber = number;
    }
}
