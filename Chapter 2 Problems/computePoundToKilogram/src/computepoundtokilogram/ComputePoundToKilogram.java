/*
 *  Write a program that converts pounds into kilograms. The program prompts the 
 * user to enter a number in pounds, converts it to kilograms, and displays the result;
 */
package computepoundtokilogram;

import java.util.Scanner;

public class ComputePoundToKilogram {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds=s.nextDouble();
        double kilo = pounds* 0.454;    // 1 pound = 0.454 kilograms;
        System.out.println(pounds+" pounds is "+kilo + " kilograms");
    }
    
}
