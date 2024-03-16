import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JLabel resultLabel;
    private static JLabel categoryLabel;

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(700, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Height Input
        JLabel heightLabel = new JLabel("Enter height in cm:");
        JTextField heightField = new JTextField();
        frame.add(heightLabel);
        frame.add(heightField);

        // Weight Input
        JLabel weightLabel = new JLabel("Enter weight in kg:");
        JTextField weightField = new JTextField();
        frame.add(weightLabel);
        frame.add(weightField);

        // Result and Category Labels
        resultLabel = new JLabel("BMI Result: ");
        categoryLabel = new JLabel("Category: ");
        frame.add(resultLabel);
        frame.add(categoryLabel);

        // Calculate Button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get user input from text fields
                String heightText = heightField.getText();
                String weightText = weightField.getText();

                try {
                    // Parse input to integers
                    int userHeight = Integer.parseInt(heightText);
                    int userWeight = Integer.parseInt(weightText);

                    if (userHeight < 0 || userHeight > 250) {
                        JOptionPane.showMessageDialog(frame, "Height should be between 0 and 250 cm.");
                        return;
                    }

                    if (userWeight < 0 || userWeight > 200) {
                        JOptionPane.showMessageDialog(frame, "Weight should be between 0 and 200 kg.");
                        return;
                    }

                    // Create an instance of Assessment
                    Assessment user = new Assessment(userHeight, userWeight);

                    // Display the calculated BMI result and Category
                    resultLabel.setText("BMI Result: " + user.calculateBMI());
                    categoryLabel.setText("Category: " + user.getBMIStatus());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid numbers.");
                }
            }
        });
        frame.add(calculateButton);

        // Reset Button
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                heightField.setText("");
                weightField.setText("");
                resultLabel.setText("BMI Result: ");
                categoryLabel.setText("Category: ");
            }
        });
        frame.add(resetButton);

        //Exit Button

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(exitButton);

        frame.setVisible(true);
    }
}
