/*
 *  Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 *  and adds all the digits in the integer;
 */
package sumofdigits;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = s.nextInt();
        int sum = 0;
        while(number>0){
            int digit = number%10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of digits in the number is " + sum);
    }
    
}
