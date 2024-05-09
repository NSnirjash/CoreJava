package math;

import java.math.BigInteger;

public class FactorialAndPrime {

    int number;
    BigInteger factorial = new BigInteger("1");

    public FactorialAndPrime() {
    }

    public FactorialAndPrime(int number) {
        this.number = number;
    }

    public BigInteger getFactorial() {
        
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(new BigInteger(i + ""));
        }
        return factorial;
    }

    public String getPrime() {
//        BigInteger count = new BigInteger("0");
        int count = 0;
        for (int i = 1; i <= factorial; i++) {
            if (factorial % i==0) {
//                count =  count.add(new BigInteger("1"));
            count  +=1;
            }
        }
        if(count == 2){
            return "It is a prime number";
        }else{
            return "it is not a ptime number";
        }
    }
}
