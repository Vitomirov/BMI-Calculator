public class Assessment extends Calculator {

    private double bmi;

    public Assessment(int height, int weight) {
        super(height, weight);
        this.bmi = calculateBMI();
    }

    public String getBMIStatus() {
        if (bmi < 18.5) {
            return "underweight.";
        } else if (bmi < 25) {
            return "normal.";
        } else if (bmi < 30) {
            return "overweight.";
        } else {
            return "obese.";
        }
    }

    public void printCategory() {
        StringBuilder resultMessage = new StringBuilder("Your BMI index shows that you are ");
        resultMessage.append(getBMIStatus());
        System.out.println(resultMessage.toString());
    }
}

