package primenumberusingmethod;
import java.util.Scanner;
public class PrimeNumberUsingMethod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The number: ");
        int num1=s.nextInt();   
        doPrime(num1);
    }
    public static  void doPrime(int num1){
        int count=0;
        int num2;
    for (num2 = 1; num2 <= num1; num2++) {
            if (num1 % num2 == 0) {
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
