public class Main {
    public static void main(String[] args) {

        // Create an instance of InputValidator for handling user input
        InputValidator inputValidator = new InputValidator();

        // User input for height and weight
        int userHeight;
        do {
            userHeight = inputValidator.inputValidation(
                    "Enter height in cm: ", "height value in cm");
            if (userHeight > 250) {
                System.out.println("Max available height for calculation is 250");
            }
        } while (userHeight < 0 || userHeight > 250);

        int userWeight;
        do {
            userWeight = inputValidator.inputValidation(
                    "Enter weight in kg: ", "weight value in kg");
            if (userWeight > 200) {
            }  System.out.println("Max available weight for calculation is 200");
            }while (userWeight < 0 || userWeight > 200) ;

            // Create an instance of Assessment
            Assessment user = new Assessment(userHeight, userWeight);

            // Display the calculated BMI result and Category
            user.printResult();
            user.printCategory();

            // Close the scanner to release resources
            inputValidator.closeScanner();
        }
    }
