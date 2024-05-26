/*
 * Write a Java program to sum values of an array.
 */
package arraysum;

public class ArraySum {

    public static void main(String[] args) {
        int[] array = {25,14,35,56,47,52,34};
        int sum = 0;
        for(int val : array){
            sum+=val;
        }
        System.out.println("Sum is: "+sum);
        
    }
    
}
