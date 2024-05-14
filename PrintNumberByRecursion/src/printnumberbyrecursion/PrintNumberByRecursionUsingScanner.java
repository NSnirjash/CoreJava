
package printnumberbyrecursion;

import java.util.Scanner;

public class PrintNumberByRecursionUsingScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Starting number");
        int start = s.nextInt();
        System.out.println("Enter finishing number");
        int finish = s.nextInt();
        PrintNumb(start, finish);
    }
    public static void PrintNumb(int start, int finish) {
        if(start<=finish){
            System.out.println(start);
            PrintNumb(start+1, finish);
        }
    }
    
}
