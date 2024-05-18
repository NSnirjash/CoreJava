
package testarray;
import java.util.Arrays;

public class RangeOfPrimeNumber {
    public static void main(String[] args) {
        int[] originalArray= new int[100];
        for(int i=0;i<originalArray.length;i++){
            originalArray[i]=i+1;
        }
//        int[] result = primeNumbers(originalArray);
        System.out.println(Arrays.toString(primeNumbers(originalArray)));
    }
    public static int[] primeNumbers(int[] myArray){
        int[] newArray = new int[50];
        int index = 0;
        for(int value : myArray){
            int count = 0;
            for(int i = 1; i<=value; i++){
                if(value%i == 0){
                    count += 1;
                }
            }
            if(count==2){
                newArray[index]=value;
                index++;
            }
        }
        return newArray;
    }
}
