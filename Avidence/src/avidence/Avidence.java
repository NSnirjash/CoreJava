package avidence;

import java.util.Scanner;

public class Avidence {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter  number 1: ");
        int num1 = s.nextInt();
        System.out.print("Please enter  number 2: ");
        int num2 = s.nextInt();

        try {
            int result = num1 / num2;
            if (num1 == 0 || num2 == 0) {
                System.out.println("Error: Numbers can't be zero.");
            } else {
                System.out.println(result);
            }

        } catch (ArithmeticException e) {
//            System.out.println("Error: Division by zero is not allowed.");
                e.printStackTrace();
        }
    }
}