package exceptionhandling;

import java.util.Scanner;

public class ExHandlingByTryCatch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = s.nextInt();
        System.out.println("Enter Second Number");
        int num2 = s.nextInt();
        
        try {
            System.out.println("Result is: "+num1/num2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
