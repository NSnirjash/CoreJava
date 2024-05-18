package factorialbyrecursion;

import java.util.Scanner;

public class FactorialByRecursion {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        
    }
    public static long factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
