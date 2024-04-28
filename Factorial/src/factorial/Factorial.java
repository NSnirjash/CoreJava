package factorial;
public class Factorial {
    public static void main(String[] args) {
//        int factValue = 5;
//        int factorial = 1;
//        for(int i=1; i<=factValue; i++){
//        factorial *=i;        //factorial=factValue*i;
//        }
//         System.out.println("Factorial is: "+factorial);

        int factValue = 5;
        int factorial = 1;
        for (int i = factValue; i >=1; i--) {
            factorial *= i;        //factorial=factValue*i;
        }
        System.out.println("Factorial is: " + factorial);
    }
}
