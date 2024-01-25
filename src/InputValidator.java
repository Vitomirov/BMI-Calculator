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

        do  {
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
            }finally {
                scanner.nextLine(); // Clear the buffer

                if(userInput<0){ //If number is negative, repeat the loop
                    validInput = false;
                }
            }
        } while (!validInput);

         return userInput;
    }

    public void closeScanner() {
        scanner.close();
    }
}
