/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraywithexceptionhandeling;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayWithExceptionHandeling {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter index number: ");
        int index = s.nextInt();
        int[] myArray = new int[100];
        Random r = new Random();

        try {
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = r.nextInt(100);

//                for (int val : myArray) {
//                    index = val;
//                }
            }
            System.out.println(myArray[index]);
            System.out.println(Arrays.toString(myArray));
        } catch (Exception e) {
            System.out.println("Out of bound");
        }
        
       int[] Array= {5,20,15,24};
        System.out.println(Array[2]);
    }

}
