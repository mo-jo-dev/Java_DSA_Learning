import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class SearchingInInfiniteSortedArray
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.print(ans(arr, 10));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 0;
        while(target > arr[end]){
            int temp = end + 1;  //This will give new start
            //Double the box value
            //End = previous end + sizeofBox*2; 
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }

    //return the index;
    // return -1 if it does not exist;
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = (start + (end - start)/2);
            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;

        }
            return -1;
    }
}