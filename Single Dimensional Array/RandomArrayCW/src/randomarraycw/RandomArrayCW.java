
package randomarraycw;

import java.util.Random;

public class RandomArrayCW {

    public static void main(String[] args) {
       
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(1000);
        }
        System.out.print("Random numbers generated: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

    
    

