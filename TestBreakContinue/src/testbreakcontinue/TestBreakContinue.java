/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbreakcontinue;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestBreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        int sum = 0;
//        while(true){
//            System.out.println("Enter value");
//            int userInput=s.nextInt();
//            sum +=userInput;
//            if(sum>=100){
//                System.out.println("Sum is: "+sum);
//                break;
//            }
//        }

        while (true) {
            System.out.print("Enter value: ");
            int userInput = s.nextInt();
            sum += userInput;
            if (sum >= 300) {
                break;
            } else if (sum >= 200) {

            } else if (sum >= 100) {
                continue;
            }
            System.out.println("Sum is " + sum);
        }

    }

}
