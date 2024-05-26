/*
 * Write a Java program to test if an array contains a specific value
 */
package findvalueinarray;

import java.util.Random;
import java.util.Scanner;

public class FindValueInArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int[] myAarray = new int[100];
        for (int i = 0; i < myAarray.length; i++) {
            myAarray[i] = r.nextInt(100);
        }
        System.out.print("Enter number: ");
        int num = s.nextInt();

        String contains = contains(myAarray, num);
        System.out.println(contains);

    }

    public static String contains(int[] array, int item) {
        for (int val : array) {
            if (item == val) {
                return "This Value is available";
            }
        }
        return "This Value is unavailable";
    }
}
