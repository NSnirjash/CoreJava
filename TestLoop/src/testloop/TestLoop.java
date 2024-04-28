package testloop;
import java.util.Scanner;
public class TestLoop {
    public static void main(String[] args) {
        // TODO code application logic here
//        int n = 1;
//        while (n <= 100) {
//            System.out.println(n+"Hello Java");
//            n++;
//        }
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter start point value");
//        int startPoint = s.nextInt();
//        System.out.println("Enter end point value");
//        int endPoint = s.nextInt();
//        while (startPoint <= endPoint) {
//            System.out.println(startPoint + "Hello Java");
//            startPoint++;  //startPoint=startPoint+1;   startpoint+=1;
//        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter start point value");
        int startPoint = s.nextInt();
        System.out.println("Enter end point value");
        int endPoint = s.nextInt();
        while (startPoint <= endPoint) {
            
            
            if(startPoint%3!=0 || startPoint%5!=0){
                System.out.println(startPoint + "Hello Java");
            }
            startPoint++;
        }
    }
}




