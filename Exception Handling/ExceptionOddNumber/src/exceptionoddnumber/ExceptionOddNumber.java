/*
 * Question:
 * Write a Java program to create a method that takes an integer as a parameter
 * and throws an exception if the number is odd.
 */
package exceptionoddnumber;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionOddNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = s.nextInt();
        
        try {
            if (num%2 == 0) {
                System.out.println(num+" is even number");
            }
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
        
        if(num%2!=0){
            try {
                throw new Exception("Odd number is not granted");
            } catch (Exception ex) {
                Logger.getLogger(ExceptionOddNumber.class.getName()).log(Level.SEVERE, "something", ex);
            }
        }
    }

}
