
package seasonidentifierusinswitcchstatrment;

import java.awt.BorderLayout;
import java.util.Scanner;

public class SeasonIdentifierUsinSwitcchStatrment {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month= s.nextInt();
        String season="";
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                
                break;
            case 3:
            case 4:
                season = "Spring";
                
                break;
            case 5:
            case 6:
                season ="Summer";
                
                break;
            case 7:
            case 8:
                season = "Rainy";
                
                break;
            case 9:
            case 10:
                season = "Autumn";
                
                break;
            case 11:
            
                season = "Late Autumn";
                
                break;
            default:
                System.out.println("Invalid Season");
        }
        System.out.println("The season for month " + month + " is " + season);
    }
    
}
