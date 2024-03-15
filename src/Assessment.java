public class BMIInterpreter extends Calculator {

    private double bmi;

    public BMIInterpreter(int height, int weight) {
        super(height, weight);
        this.bmi = calculateBMI();
    }

    public String getBMIStatus() {
        if (bmi < 18.5) {
            return "Underweight.";
        } else if (bmi < 25) {
            return "Normal.";
        } else if (bmi < 30) {
            return "Overweight.";
        } else {
            return "Obese.";
        }
    }

    public void printCategory() {
        StringBuilder resultMessage = new StringBuilder("Your BMI index shows that you are ");
        resultMessage.append(getBMIStatus());
        System.out.println(resultMessage.toString());
    }
}

