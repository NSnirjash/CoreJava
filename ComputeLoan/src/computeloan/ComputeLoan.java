package computeloan;

import java.util.Scanner;

public class ComputeLoan {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = s.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.print("Enter number of years as an integer: ");
        int numberOfYear = s.nextInt();
        System.out.print("Enter loan amount: ");
        double loanAmount = s.nextDouble();
        double monthlyPayment = loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate, numberOfYear*12)));
        double totalPayment = monthlyPayment * numberOfYear * 12;
        System.out.print("The monthly payment is: "+monthlyPayment + '\n');
        System.out.println("The total payment is: "+totalPayment);
    }

}
 