
package findmaxminnumber;

import java.util.Scanner;

public class FindMaxMinNumber {

    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);
        int lowestNum = Integer.MAX_VALUE;
        int highestNum = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer number : ");
            int number = scanner.nextInt();

            if (number < lowestNum) {
                lowestNum = number;
            }

            if (number > highestNum) {
                highestNum = number;
            }
        }

        System.out.println("The Lowest number is : " + lowestNum);
        System.out.println("The Highest number is : " + highestNum);
    }
}
