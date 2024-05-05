/*
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total
 * then computes the gratuity and total;
 */
package subtotalandgtatuitycalculator;

import java.util.Scanner;

public class SubtotalAndGtatuityCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double subtotal = s.nextDouble();
        System.out.print("Enter the gratuity rate (in percentage): ");
        double gratuityRate= s.nextDouble();
        double gratuity=subtotal * (gratuityRate / 100);
        double  total = subtotal+gratuity;
        System.out.println("The gratuity is $" + gratuity);
        System.out.println("The total is $" + total);
        
    }
    
}
