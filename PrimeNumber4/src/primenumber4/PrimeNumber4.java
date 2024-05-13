
package primenumber4;

import java.util.Scanner;

public class PrimeNumber4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter start number");
        int n1 = s.nextInt();
        System.out.println("Enter second number");
        int n2 = s.nextInt();
        PrimeNumber pr = new PrimeNumber();
        pr.num1=n1;
        pr.num2=n2;
        pr.showPrime();
    }
    
}
