package sumofpositiveintegers;

import java.util.Scanner;

public class SumOfPositiveIntegers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Enter a sequence of integers (negative to stop):");
        while (true) {
            number = s.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of positive integers: " + sum);
        s.close();
    }
}
