/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturescale;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TemperatureScale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the value of temperature in Farenheit: ");
//        float farenheit = s.nextFloat();
//        float celsius = ((farenheit - 32)/9)*5;
//        System.out.println("The value of temperature in Celsius: "+celsius);
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of temperature in celsius: ");
        float celsius = s.nextFloat();
        float farenheit = ((celsius/5)*9)+32;
        System.out.println("The value of temperature in Celsius: "+farenheit);
        
    }

}
