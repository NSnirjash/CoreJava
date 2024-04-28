package guessingnumbers;
import java.util.Scanner;
public class GuessingNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = (int) (Math.random() * 101);
        int maxAttemp = 5;
        int attempCount = 0;
        while (attempCount < maxAttemp) {
            System.out.println("Enter your number");
            int guess = s.nextInt();
            if (guess == number) {
                System.out.println("Correct number");
                break;
            } else if (guess > number) {
                System.out.println("Your guess is higher");
            } else if (guess < number) {
                System.out.println("Your guess is lower");
            }
            attempCount++;
        }
        if (attempCount == maxAttemp) {
            System.out.println("Sorry bro, You loss the game. Better luck next time");
            System.out.println("The number is: " + number);
        }
    }
}

