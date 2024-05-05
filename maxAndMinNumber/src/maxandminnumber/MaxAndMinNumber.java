/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxandminnumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MaxAndMinNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Three Number");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        int maxNum;
        int minNum;
        if(num1>num2 && num1>num3){
            maxNum=num1;
        }
        else if(num2>num1 && num2>num3){
            maxNum=num2;
        }
        else{
        maxNum=num3;
        }
        System.out.println("Maximum Number Is: "+maxNum);
        
        if(num1<num2 && num1<num3){
        minNum=num1;
        }
        else if(num2<num1 && num2<num3){
        minNum=num2;
        }
        else{
        minNum=num3;
        }
        System.out.println("Minimum number is: "+minNum);
    }
    
}
