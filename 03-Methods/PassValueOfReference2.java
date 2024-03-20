import java.util.Arrays;

public class PassValueOfReference2 {
    public static void main(String[] args) {
      //  int[] arr = new int[]{1, 2, 3, 4, 5}; (or)
      int[] arr = {1, 2, 3, 4, 5};
      change(arr);
      System.out.println(Arrays.toString(arr));
    }

    static void change(int[] array){

        //arr -> [1,2,3,4,5] <- array
        array[0] = 0;
    }
}
