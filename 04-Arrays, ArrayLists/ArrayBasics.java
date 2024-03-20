//Size need to be predefined
//All the type of data in the array must be same

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        //Method 1
        int[] arr1 = new int[3];
        System.out.println("Default valued array1: " + Arrays.toString(arr1));
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println("array1: " + Arrays.toString(arr1));

        //Method 2 
        int[] arr2 = new int[]{1, 2, 3};
        System.out.println("array2: " + Arrays.toString(arr2));

        //Method 3
        int[] arr3 = {1, 2, 3};
        System.out.println("array3: " + Arrays.toString(arr3));
    }
}
