/*
 * Write a program that reads a number in feet, converts it to meters, and displays the result
 * and displays the result;
 */
package feettometer;

import java.util.Scanner;

public class FeetToMeter {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the value for feet: ");
        double feet = s.nextDouble();
        double meter = feet * 0.305;    //1 feet = 0.305 meter;
        System.out.println(feet+" Feet is: "+meter+" meter.");
        
        
    }
    
}
