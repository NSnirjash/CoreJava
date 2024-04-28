package selection;

import java.util.Scanner;

public class Selection {

    public static void main(String[] args) {
//        System.out.println(10>=10);
//        System.out.println(10!=10);
//        System.out.println(10<10);

        Scanner scanner = new Scanner(System.in);
        int maxNumber;
        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter Third Number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            maxNumber = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            maxNumber = secondNumber;
        } else {
            maxNumber = thirdNumber;
        }
        System.out.println("Maximum number is: "+maxNumber);
    }

}
