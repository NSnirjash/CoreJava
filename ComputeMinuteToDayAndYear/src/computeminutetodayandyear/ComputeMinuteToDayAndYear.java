/*
 *  Write a program that prompts the user to enter the minutes (e.g., 1 billion),
 *  and displays the number of years and days for the minutes;
 */
package computeminutetodayandyear;

import java.util.Scanner;

public class ComputeMinuteToDayAndYear {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter the number of minutes: ");
        double min = s.nextDouble();
//        double hour = min/60;
//        double day = hour/24;
//        double year = day/365;
          double minutesInYear = 60 * 24 * 365;
          double year = min / minutesInYear;
          double day= (min % minutesInYear) / (60 * 24);
        System.out.println(min+" minutes is approximately "+year+" years and "+day+" days.");
        
    }
    
}
