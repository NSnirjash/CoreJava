
package maxandminnumbercw;

import java.util.Scanner;

public class MaxAndMinNumberCW {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = s.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = s.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = s.nextInt();
        int maxNumber;
        int minNumber; 
        if(num1>num2 && num1>num3){
            maxNumber = num1;
        }
        else if(num2>num1 && num2>num3){
            maxNumber = num2;
        }
        else{
            maxNumber = num3;
        }
        System.out.print("The largest number is: "+maxNumber);
        if(num1<num2 && num1<num3){
            minNumber = num1;
        }
        else if(num2<num1 && num2<num3){
            minNumber = num2;
        }
        else{
            minNumber = num3;
        }
        System.out.print("\nThe smaller number is: "+minNumber);
    }
    
}
