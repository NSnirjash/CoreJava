package distanceoftwopoints;

import java.util.Scanner;

public class DistanceOfTwoPoints {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of x1: ");
        int x1 = s.nextInt();
        System.out.print("Enter the value of x2: ");
        int x2 = s.nextInt();
        System.out.print("Enter the value of y1: ");
        int y1 = s.nextInt();
        System.out.print("Enter the value of y2: ");
        int y2 = s.nextInt();
        double preResult = Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2);
        double result = Math.pow(preResult, 0.5);
        System.out.println(" The distance between the two points is:  "+result);
    }
    
}
