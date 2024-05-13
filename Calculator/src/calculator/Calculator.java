
package calculator;

import java.util.Scanner;
import math.Calculation;

public class Calculator {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1 = s.nextInt();
        System.out.println("Pleas enter second number");
        int number2 = s.nextInt();
        System.out.println("Choose the operation (+ , - , * , /)");
        char choice = s.next().charAt(0);
        Calculation c= new Calculation();
        
        c.number1=number1;
        c.number2=number2;
        c.choice = choice;
        double result = c.doCalculation();
        
        System.out.println(result);
        System.out.println(c.checkPrime());
        
    }
    
}
