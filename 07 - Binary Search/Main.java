import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(BinarySearch(arr, 10));
    }

    //return the index;
    // return -1 if it does not exist;
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            //Find the middle element
            // mid = (start + end) /2;      // It might be possible that the (start + end) exceeds the range of java integer
            // So, optimized way is 
            int mid = (start + (end - start)/2);
            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;

        }
            return -1;
    }
}