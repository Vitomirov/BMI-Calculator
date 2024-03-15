public class Calculator {
    private int height;
    private int weight;

    public void setHeight(int height) {
        this.height = height;
    }

    public Calculator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    // Method to calculate BMI
    public double calculateBMI (){
        // Convert height to meters (as BMI formula expects height in meters)
        double heightInMeters = (double) height /100;

        // Calculate BMI using the formula
        double bmi = (double) weight / (heightInMeters * heightInMeters);

        // Round the BMI to two decimal places
        return Math.round(bmi *100.0)/ 100.0;
    }

    // Print result
    public void printResult (){
        System.out.println("BMI index is " + calculateBMI());

    }
}
