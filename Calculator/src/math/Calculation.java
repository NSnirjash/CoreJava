
package math;

public class Calculation {

    public int number1;
    public int number2;
    public char choice;
    double result = 0.0;
    public Calculation() {
    }

//    public Calculation(int number1, int number2, String choice) {
//        this.number1 = number1;
//        this.number2 = number2;
//        this.choice =(int) choice;
//    }
    
    
    
    public double doCalculation(){
        
        switch (choice) {
            case '+':
                result = number1+number2;    
                break;
            case '-':
                result = number1-number2;    
                break;
            case '*':
                result = number1*number2;    
                break;
            case '/':
                result = number1/number2;    
                break;
            default:
                System.out.println("invalid operator");
        }
        return result;
    }
    
    public String checkPrime(){
        int count = 0;
        for(int i =0; i<=result; i++){
            if(result%i==0){
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

