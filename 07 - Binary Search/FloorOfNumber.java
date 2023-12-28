import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class FloorOfNumber
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.print(floorOfNumber(arr, 15));
    }

    // Floor is the greatest number smaller then or equal to target
    static int floorOfNumber(int[] arr, int target){
        // If the target number is smaller than the smallest number
        if(target < arr[0]){
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
            return end;
    }
}