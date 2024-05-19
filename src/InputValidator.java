import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
    private Scanner scanner;

    public InputValidator() {

        this.scanner = new Scanner(System.in);
    }

    public int inputValidation(String inputText, String inputType) {
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(inputText);
                userInput = scanner.nextInt();

                if (userInput > 0) {
                    validInput = true;
                } else {
                    System.out.println("Value must be a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a " + inputType + ".");
                scanner.nextLine(); // Clear the buffer
            }
        }

        return userInput;
    }

    public void closeScanner() {
        scanner.close();
    }
}
