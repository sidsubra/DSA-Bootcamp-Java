//Given an ascending sorted array. Return ceiling of an integer from the array.
// Eg 1: arr = [2,3,5,9,14,16,18], num = 15 ; then ans = 16
// Eg 1: arr = [2,3,5,9,14,15,16,18], num = 15 ; then ans = 15

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int index = SearchCeiling(arr, target);
        System.out.println("The ceiling of "+target+" : " + arr[index]);
    }
    static int SearchCeiling(int[] arr, int target){

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0, end = arr.length - 1;
        while(start <= end){
               int middleIndex = (end - start)/2 + start;
               if(arr[middleIndex] == target){
                 return middleIndex;
               }
               else if(arr[middleIndex] > target){
                //LHS
                end = middleIndex - 1;
               }
               else{
                start = middleIndex + 1;
               }
        }
        // NOTE: THE ONLY DIFFERENCE
        return start;
    }
}
