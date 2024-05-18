package testarray;

import java.util.Arrays;
import java.util.Random;

public class TestArrayWithMethod {

    public static void main(String[] args) {
        int[] myList = new int[20];

        for (int i = 0; i < myList.length; i++) {
            Random r = new Random();
            int num = r.nextInt(100);
            myList[i] = num;
        }
        System.out.println("The Array is: "+Arrays.toString(myList));
        
        int maxNum = maxNumber(myList);
        System.out.println("max: "+maxNum);
        minNumber(myList);
        
        
        System.out.println("Average: "+Average(myList));

    }

    public static int maxNumber(int[] myList) {
        int maxNum = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (maxNum < myList[i]) {
                maxNum = myList[i];
            }
        }
        return maxNum;
    }
    public static void minNumber(int[] myList){
        int MinNum = myList[0];
        for(int i = 0; i<myList.length; i++){
            if(MinNum>myList[i]){
                MinNum=myList[i];
            }
        }
        System.out.println("min: "+MinNum);
    }
    public static int Average(int[] myList){
        int sum = 0;
        int avg = 0;
        
        for(int value : myList){
            sum += value;
        }
        avg = sum/myList.length;
        return avg;
    }
}
