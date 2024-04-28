/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SequenceNumberUsingContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
        System.out.println("Enter start point value");
        int startPoint = s.nextInt();
        System.out.println("Enter end point value");
        int endPoint = s.nextInt();
        while (startPoint<=endPoint){
            if(startPoint%3==0 && startPoint%3==0){
            startPoint++;
                continue;
            }
            System.out.println("Number is: "+startPoint);
            startPoint++;
        }
    }
    
}
