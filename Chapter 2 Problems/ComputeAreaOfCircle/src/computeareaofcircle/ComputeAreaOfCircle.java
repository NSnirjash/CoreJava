/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computeareaofcircle;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeAreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        double radius;
//        double area;
//        radius=25;
//        area=3.1416*radius*radius;
//        System.out.println("Area of this circle is: "+area);
        
        
//        double radius=20;
//        double area=radius*radius*3.1416;
//        System.out.println("Area of this circle is: "+area);
        
          Scanner s= new Scanner(System.in);
          System.out.println("Enter the value of radius");
          double radius= s.nextDouble();
          double area = radius*radius*3.1416;
          System.out.println("Area of this circle is: "+area);
        
        
    }
    
}
