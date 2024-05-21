/*
 *  Write a program that prompts the user to enter the side of a hexagon and 
 *  displays its area;
 */
package computeareaofhexagon;

import java.util.Scanner;

public class ComputeAreaOfHexagon {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = s.nextDouble();
        double preArea = ((3 * Math.pow(3, 0.5))/2);
        double area = preArea* Math.pow(side, 2);
        System.out.println("The area of the hexagon is: "+area);
    }
    
}
