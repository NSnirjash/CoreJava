
package printnumberbyrecursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of Numbers: "+sum(6));
        
    }
    public static int sum(int n){
        if(n>0){
            return n+sum(n-1);
        }else{
        return 0;
        }
    }
}
