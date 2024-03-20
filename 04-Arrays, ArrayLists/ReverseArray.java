//Reverse array

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int temp,start = 0, end = arr.length - 1;
        
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }    

        System.out.println("The reversed array is:"+ Arrays.toString(arr));
    }
}
