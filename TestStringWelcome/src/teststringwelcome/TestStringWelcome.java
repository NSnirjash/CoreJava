/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststringwelcome;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestStringWelcome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = s.next();
        System.out.println("Wellcome " + userName);
    }
}
