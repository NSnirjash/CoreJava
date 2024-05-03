/*
 * Write a program that calculates the energy needed to heat water from an 
 * initial temperature to a final temperature. Your program should prompt 
 * the user to enter the amount of water in kilograms and the initial nd 
 * final temperatures of the water 
 */
package waterheatingenergy;

import java.util.Scanner;

public class WaterHeatingEnergy {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double weightOfWater = scanner.nextDouble();
        System.out.print("Enter the initial temperature of the water in Celsius: ");
        double initialTemperature = scanner.nextDouble();
        System.out.print("Enter the final temperature of the water in Celsius: ");
        double finalTemperature = scanner.nextDouble();
        double energy = weightOfWater * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed to heat the water is: " + energy + " joules.");
    }
}

        

        

        

        

        
