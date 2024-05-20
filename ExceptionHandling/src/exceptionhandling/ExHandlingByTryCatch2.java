
package exceptionhandling;

import java.io.ObjectStreamConstants;
import java.util.Scanner;

public class ExHandlingByTryCatch2 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = s.nextInt();
        System.out.println("Enter Second Number");
        int num2 = s.nextInt();
        
        try {
            if(num1!=0){
                System.out.println("Result is: "+num1/num2);
            }
            else{
                System.out.println("First numbers can't be zero.");
            }
        } catch (Exception e) {
            System.out.println("Second number can't be zero.");
        }
    }
}
