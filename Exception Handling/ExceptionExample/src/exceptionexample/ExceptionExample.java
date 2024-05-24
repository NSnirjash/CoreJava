/*
 * Question:
 * Write a Java program that throws an exception and catch it using a try-catch block.
 */
package exceptionexample;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int result = divideNumbers(20, 0);
            System.out.println("Result: "+result);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static int divideNumbers(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("You can't divide any number by zero");
        }

        return num1 / num2;
    }
}
