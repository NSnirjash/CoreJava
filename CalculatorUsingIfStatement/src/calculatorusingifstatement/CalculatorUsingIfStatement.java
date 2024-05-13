
package calculatorusingifstatement;

import java.util.Scanner;

public class CalculatorUsingIfStatement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        double num1 = s.nextDouble();
        System.out.print("Enter the second number:");
        double num2 = s.nextDouble();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = s.next().charAt(0);
        double result = 0;
        if(operator=='+'){
            result = num1 + num2;
        }else if(operator=='-'){
            result = num1 - num2;
        }else if(operator=='*'){
            result = num1 * num2;
        }else if(operator=='/'){
            if(num2!=0){
                result = num1 / num2;
            }
            else{
                System.out.println("Error: Division by zero!");
                return;
            }
            
        }
        else{
        System.out.println("Error: Invalid operator!");
        return;
        }
        System.out.println("Result"+result);
    }
    
}
