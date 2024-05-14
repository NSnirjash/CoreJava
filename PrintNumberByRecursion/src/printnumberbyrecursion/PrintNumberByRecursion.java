
package printnumberbyrecursion;

public class PrintNumberByRecursion {

    public static void main(String[] args) {
        
        printNumber(10);  
        
    }
    
    
    public static void printNumber(int n){
        if(n>0){
            
            printNumber(n-1);
            
            System.out.println(n);
            
        }
        
    }  
    
}
