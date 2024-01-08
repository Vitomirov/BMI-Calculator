public class Main {
    public static void main(String[] args) {

        // Create an instance of InputHandler for handling user input
        InputHandler inputHandler = new InputHandler();

        // User input for height and weight
        int userHeight = inputHandler.readPositiveInteger("Enter height in cm: ", "height value in cm");
        int userWeight = inputHandler.readPositiveInteger("Enter weight in kg: ", "weight value in kg");

        // Create an instance of BMIInterpreter
        BMIInterpreter user = new BMIInterpreter(userHeight, userWeight);

        // Display the calculated BMI result and Category
        user.printResult();
        user.printCategory();

        // Close the scanner to release resources
        inputHandler.closeScanner();
    }
}
