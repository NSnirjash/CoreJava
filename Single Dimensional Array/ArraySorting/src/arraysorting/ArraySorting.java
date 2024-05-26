/*
 * Write a Java program to sort a numeric array and a string array.
 */
package arraysorting;

import java.util.Arrays;



public class ArraySorting {

    public static void main(String[] args) {
        int[] myArray1 = {25,20,16,37,65,54,85,75,10};
        String[] myArray2 = { "Java","Python","PHP","C#","C Programming","C++"};
        
        System.out.println("Original Integer array: "+Arrays.toString(myArray1));
        Arrays.sort(myArray1);
        System.out.println("Sorted Integer array: "+Arrays.toString(myArray1));
        
        System.out.println("Original string array: "+Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println("Original string array: "+Arrays.toString(myArray2));
    }
    
}
