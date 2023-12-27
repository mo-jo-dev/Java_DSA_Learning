import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class OrderAgnosticBS
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(orderAgnosticBS(arr, 10));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //Find whether array is sorted in ascending or descending order.
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = (start + (end - start)/2);
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else{
                if(target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}