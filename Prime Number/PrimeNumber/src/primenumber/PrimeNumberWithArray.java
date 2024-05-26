
package primenumber;

public class PrimeNumberWithArray {
    
     public static void main(String[] args) {
        int[] primes = findPrimes(100);
        System.out.println("Prime numbers from 1 to 100:");
        for (int prime : primes) {
            if (prime != 0) {
                System.out.print(prime + " ");
            }
        }
    }
    public static int[] findPrimes(int limit) {
        int[] primes = new int[limit + 1];
        for (int i = 2; i <= limit; i++) {
            primes[i] = i;
        }
        for (int i = 2; i * i <= limit; i++) {
            if (primes[i] != 0) {
                for (int j = i * i; j <= limit; j += i) {
                    primes[j] = 0;
                }
            }
        }
        return primes;
    }
}
