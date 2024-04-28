/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststringvowelorconsonant;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestStringVowelOrConsonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner word = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String userName = word.next().toUpperCase();       

        if (userName.startsWith("A")||userName.startsWith("E")||userName.startsWith("I")
                ||userName.startsWith("O")||userName.startsWith("U")) {
            System.out.println("Your Word start with vowel");
        } else {
            System.out.println("Your Word start with Consonant");
        }
    }

}
