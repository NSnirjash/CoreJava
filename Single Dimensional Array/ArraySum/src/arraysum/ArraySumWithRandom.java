/*
 * Write a Java program to sum values of an array.
 */
package arraysum;

import java.util.Arrays;

import java.util.Random;

public class ArraySumWithRandom {
    
    public static void main(String[] args) {
        Random r = new Random();
        
        int[] array = new int[100];
        
        for(int i = 0; i < array.length; i++){
            array[i]=r.nextInt(100);
        }
        
        int sum = 0; 
        
        for(int val : array){
            sum += val;
        }
        
        System.out.println("The array is: "+Arrays.toString(array));
        System.out.println("Sum is: "+ sum);   
    }
    
}
