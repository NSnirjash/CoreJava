
package primenumber;

import java.util.Scanner;

public class PrimeNumberWithStartAndEndValue {
    
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter starting number");
        int number1=s.nextInt();
        System.out.println("Enter ending number");
        int number2=s.nextInt();
        int count=0;
        System.out.println("The prime numbers are:");
        for(int j=number1; j<=number2; j++){
            for(int i=1; i<=j; i++){
                if(j%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(j);
                
            }
            count=0;
        }
    }
}
