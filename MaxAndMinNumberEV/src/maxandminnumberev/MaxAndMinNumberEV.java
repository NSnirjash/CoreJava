

package maxandminnumberev;

import java.util.Scanner;

public class MaxAndMinNumberEV {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=s.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=s.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3=s.nextInt();
        System.out.print("Enter 4th number: ");
        int num4=s.nextInt();
        System.out.print("Enter 5th number: ");
        int num5=s.nextInt();
        int maxNumber;
        int minNumber;
        if(num1>num2 && num1>num3 && num1>num4 && num1>num5){
            maxNumber = num1;
        }else if(num2>num1 && num2>num3 && num2>num4 && num2>num5){
            maxNumber = num2;
        }else if(num3>num1 && num3>num2 && num3>num4 && num3>num5){
            maxNumber = num3;
        }else if(num4>num1 && num4>num2 && num4>num3 && num4>num5){
            maxNumber = num4;
        }else{
            maxNumber = num5;
        }   
        System.out.println("Highest Number is: "+maxNumber);
        
        if(num1<num2 && num1<num3 && num1<num4 && num1<num5){
            minNumber = num1;
        }else if(num2<num1 && num2<num3 && num2<num4 && num2<num5){
            minNumber = num2;
        }else if(num3<num1 && num3<num2 && num3<num4 && num3<num5){
            minNumber = num3;
        }else if(num4<num1 && num4<num2 && num4<num3 && num4<num5){
            minNumber = num4;
        }else{
            minNumber = num5;
        }  
        System.out.println(" Number is: "+minNumber);
    }
    
}
