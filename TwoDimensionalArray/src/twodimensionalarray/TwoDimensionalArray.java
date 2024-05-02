package twodimensionalarray;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum=doSumOfArrays(numbers);
        System.out.println(sum);
    }

    public static int doSumOfArrays(int[][] myArrays) {
        int sum = 0;
        for (int row = 0; row < myArrays.length; row++) {
            for(int col = 0; col<myArrays[0].length;col++){
                sum += myArrays[row][col];
            }
        }
        return sum;
    }

}
