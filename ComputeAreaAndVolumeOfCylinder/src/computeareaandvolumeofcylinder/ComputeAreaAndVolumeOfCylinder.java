/*
 * Write a program that reads in the radius and length
 * of a cylinder and computes the area and volume using the following formulas
 */
package computeareaandvolumeofcylinder;

import java.util.Scanner;

public class ComputeAreaAndVolumeOfCylinder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        double radius = s.nextDouble();
        System.out.print("Enter the value of length: ");
        double length = s.nextDouble();
        double PI = 3.1416;
        double area = 2 * PI * radius * (radius + length);
        double volume = PI * radius * radius * length;
        System.out.print("Area of the cylinder is: "+area+'\n');
        System.out.print("Volume of the cylinder is: "+volume);
        
    }

}
