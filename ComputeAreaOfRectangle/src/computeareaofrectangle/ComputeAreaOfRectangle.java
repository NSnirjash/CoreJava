/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computeareaofrectangle;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeAreaOfRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        float length=20;
//        float wedth=15;
//        float area=length*wedth;
//        System.out.println("Area of rhis rectangle is; "+area);
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The length");
        double length = s.nextDouble();
        System.out.println("Enter The wedth");
        double wedth = s.nextDouble();
        double area=length*wedth;
        System.out.println("Area of this rectangle is: "+area);
        
        
    }
    
}
