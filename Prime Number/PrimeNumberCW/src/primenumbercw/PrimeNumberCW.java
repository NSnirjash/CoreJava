/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumbercw;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PrimeNumberCW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1 = s.nextInt();
        int count = 0;
        for(int i = 1;i<=num1;i++){
            if(num1%i==0){
                count +=1;
            }
        }
        if(count==2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
    
}
