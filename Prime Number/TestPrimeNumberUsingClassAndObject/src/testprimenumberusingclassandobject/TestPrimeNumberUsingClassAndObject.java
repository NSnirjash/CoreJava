
package testprimenumberusingclassandobject;

import TestClassAndObject.PrimeNumber;

public class TestPrimeNumberUsingClassAndObject {

    public static void main(String[] args) {
        PrimeNumber pn=new PrimeNumber(33);
//        String massage = pn.checkPrimeNumber();
//        System.out.println(massage);
         
        System.out.println("it is "+pn.checkPrimeNumber());
    }
    
}
