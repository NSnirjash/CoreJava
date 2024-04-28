package primenumber2;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int count = 0;

        for (int j = 1; j <= 100; j++) {
            for (int i = 1; i <= j; i++) {

                if (j % i == 0) {
                    count++;// count=1 count=2
                }
            }

            if (count == 2) {
                System.out.println(j);
            } 
                
            count=0;
        }    
    }
    
}
