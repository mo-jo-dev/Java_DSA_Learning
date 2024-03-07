import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class CeilingOfNumber
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.print(ceilingOfNumber(arr, 15));
    }

    // Ceiling is the smallest number greater then or equal to target
    static int ceilingOfNumber(int[] arr, int target){
        // If the target number is greater than the largest number
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + (end - start)/2);
            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;

        }
            return arr[start];
    }
}