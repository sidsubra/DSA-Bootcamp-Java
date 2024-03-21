//Sorted Array (Assuming ascending order)
//Steps: 
// 0. start = 0, end = array.length - 1
// 1. Find middle element. If middle element = target element. Stop !
// 2. If middle element > target element, then target element is in LHS. end = middle element index - 1
//      else if middle element < target element, then target element is in RHS. start = middle element index + 1
// 3. Continue this until the middle element is target element. Worst case: atlast start = end, that is array has 1 element

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int index = Search(arr, target);
        System.out.println("The element is found in the index: " + index);
    }
    static int Search(int[] arr, int target){
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
        return -1;
    }
    
}


//middle element formula
// mid = (start + end)/2 = (start + end)/2 + start - start = (start + end + 2start - 2start)/2 = (end - start + 2start)/2 = (end - start)/2 + start