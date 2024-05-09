package calculator;

public class Calculation {

    double num1 = 0;
    double num2 = 0;
    int choice = 1;

    public Calculation() {
    }
    
    public Calculation(double newNum1, double newNum2, int newChoice) {
        this.num1=newNum1;
        this.num2=newNum2;
        this.choice=newChoice;
    }
    

    public double useCalculator() {
        
        double result = 0;
        switch (choice) {
            case 1:
                result=num1+num2;
                break;
            case 2:
                result=num1-num2;
                break;
            case 3:
                result=num1*num2;
                break;
            case 4:
                result=num1/num2;
                break;
            default:
                throw new AssertionError();
        }
        return result;
    }

}
