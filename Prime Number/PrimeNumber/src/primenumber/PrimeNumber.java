
package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1 = s.nextInt();
        int count = 0;
        for(int i = 1;i<=num1;i++){
            if(num1%i==0){
                count +=1;
            }
        }
        if(count==2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
    
}
