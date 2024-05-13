package math;

public class PrimeNumber {

    int number = 1;

    public PrimeNumber() {
    }
    
    public PrimeNumber(int newNumber){
        this.number=newNumber;
    }

    public String checkPrime() {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if(number%i==0){
                count +=1;
            }
        }
        if(count==2){
            return "It is a prime number";
        }else{
            return "It is not a prime number";
        }
    }
}
