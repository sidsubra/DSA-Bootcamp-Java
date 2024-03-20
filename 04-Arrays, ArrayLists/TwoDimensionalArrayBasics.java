import java.util.Arrays;

public class TwoDimensionalArrayBasics {
    public static void main(String[] args) {
        //Method 1
        int[][] arr1 = new int[2][2];
        arr1[0][0] = 0;
        arr1[0][1] = 1;
        arr1[1][0] = 2;
        arr1[1][1] = 3;
        System.out.println("array1: " + Arrays.toString(arr1));

        //Method 2
        int [][] arr2 = new int[][]{{0,1},{2,3}};
        System.out.println("array2: " + Arrays.toString(arr2));

        //Method 2
        int [][] arr3 = {{0,1},{2,3}};
        System.out.println("array3: " + Arrays.toString(arr3));
    }
}
