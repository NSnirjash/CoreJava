
package factorialev;

import java.util.Scanner;

public class FactorialEV {

    public static void main(String[] args) {
        int factValue = 5;
        int factorial = 1;
        for (int i = factValue; i >=1; i--) {
            factorial *= i;        
        }
        System.out.println("Factorial of "+factValue+" is: " + factorial);
    }
    
}
