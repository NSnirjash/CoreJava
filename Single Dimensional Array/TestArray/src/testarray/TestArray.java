package testarray;

import java.util.Arrays;
import java.util.Random;

public class TestArray {

    public static void main(String[] args) {
        int[] myList = new int[100];

        for (int i = 0; i < myList.length; i++) {
            Random r = new Random();
            int num = r.nextInt(100) + 1;
            myList[i] = num;
        }
        int sum = 0;
        int avg = 0;
        int[] newList1 = new int[myList.length];
        int[] newList2 = new int[myList.length];

        for (int value : myList) {
            sum += value;
        }
        avg = sum / myList.length;

        int count1 = 0;
        int index1 = 0;
        for (int value : myList) {
            if (value > avg) {
                count1 += 1;
                newList1[index1] = value;
                index1++;
            }
        }
        int count2 = 0;
        int index2 = 0;
        for (int value : myList) {
            if (value < avg) {
                count2 += 1;
                newList2[index2] = value;
                index2++;
            }
        }

        int maxNumber = 0;
        for (int value : myList) {
            if (maxNumber < value) {
                maxNumber = value;
            }
        }

        int minNumber = 999;
        for (int value : myList) {
            if (minNumber > value) {
                minNumber = value;
            }
        }

        int maxNumber1 = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (maxNumber1 < myList[i]) {
                maxNumber1 = myList[i];
            }
        }

        int minNumber1 = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (minNumber1 > myList[i]) {
                minNumber1 = myList[i];
            }
        }

        System.out.println("The Array is: " + Arrays.toString(myList));
        System.out.print("Sum of Numbers: " + sum);
        System.out.print("\nAvarage of Numbers: " + avg);
        System.out.print("\nTotal  Numbers above the average value: " + count1);
        System.out.print("\nTotal  Numbers under the average value: " + count2);
        System.out.print("\nMaximum  Numbers is: " + maxNumber);
        System.out.print("\nMinimum  Numbers is: " + minNumber);
        System.out.print("\nNumbers those are greater than average value: " + Arrays.toString(newList1));
        System.out.print("\nNumbers those are less than average value: " + Arrays.toString(newList2));
        System.out.print("\nMaximum  Numbers is: " + maxNumber1);
        System.out.print("\nMinimum  Numbers is: " + minNumber1);
    }

}
