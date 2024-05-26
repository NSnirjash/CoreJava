
package primenumberev;

import java.util.Scanner;

public class PrimeNumberEV {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        int count = 0;
        for (int n = 1; n <= number; n++) {
            if (number % n == 0) {
                count += 1;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
    
}
