package TestClassAndObject;

public class PrimeNumber {

    int number = 5;

    public PrimeNumber() {
    }

    public PrimeNumber(int newNumber) {
        number = newNumber;
    }

    public String checkPrimeNumber() {
        int count = 0;
        String result = "";
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            result = "a prime number";
        } else {
            result = "not a prime number";
        }
        return result;
    }
    
}
