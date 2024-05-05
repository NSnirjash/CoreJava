/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumandaverage;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SumAndAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Five number:");
        double num1=s.nextDouble();
        double num2=s.nextDouble();
        double num3=s.nextDouble();
        double num4=s.nextDouble();
        double num5=s.nextDouble();
        double sum=num1+num2+num3+num4+num5;
        System.out.println("Sum of numbers: "+sum);
        double avg=(num1+num2+num3+num4+num5)/5;
        System.out.println("Average of numbers: "+avg);

//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Three number:");
//        double num1=s.nextDouble();
//        double num2=s.nextDouble();
//        double num3=s.nextDouble();
//        double num4=s.nextDouble();
//        double num5=s.nextDouble();
//        double avg=(num1+num2+num3+num4+num5)/5;
//        System.out.println("Average of numbers: "+avg);
          
    }
    
}
