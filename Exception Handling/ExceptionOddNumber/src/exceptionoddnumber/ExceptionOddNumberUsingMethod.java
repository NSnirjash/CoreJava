/*
 * Question:
 * Write a Java program to create a method that takes an integer as a parameter
 * and throws an exception if the number is odd.
 */
package exceptionoddnumber;

import java.util.Scanner;

public class ExceptionOddNumberUsingMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        CheckNumber(n);
        
    }
    
    public static void CheckNumber(int n){
        try{
            checkEvenNumber(n);
            System.out.println(n+" is even number");
        }catch(Exception e){
            System.out.println("Error; "+e.getMessage());
        }
    }
    
    public static void checkEvenNumber(int n) throws Exception {
        if(n%2!=0){
            throw new Exception("Odd number is not granted");
        }
    }
}
