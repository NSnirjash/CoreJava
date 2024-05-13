package primenumber4;

public class PrimeNumber extends PrimeNumber4 {

    public int num1;
    public int num2;

    public PrimeNumber() {
    }

    public void showPrime() {

        int count = 0;
        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
            count = 0;
        }

        
    }
}
