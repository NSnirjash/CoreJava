
package calculatorbyswitchcase;

import java.util.Scanner;

public class CalculatorBySwitchCase {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        System.out.print("Entre second number: ");
        int num2 = s.nextInt();
        System.out.println("add(+) press 1 \nSubstruction(-) prees 2 \nMultiplication(*) pres 3 \nDividitation(/) press 4");
        int choice = s.nextInt();
        float result = 0.0f;
        switch (choice) {
            case 1:
                result = num1+num2;  
                break;
            case 2:
                result = num1-num2;  
                break;
            case 3:
                result = num1*num2;  
                break;
            case 4:
                result = num1/num2;  
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Result is: "+result);
    }
    
}
