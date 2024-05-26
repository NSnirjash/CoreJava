/*
 * Write a Java program to copy an array by iterating the array.
 */
package copyarray;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int[] newArray = new int[9];

        System.out.println("Original Array: " + Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        System.out.println("Copy Array: "+Arrays.toString(newArray));
    }

}
