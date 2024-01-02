import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {5, 4, 3, 2, 1};
        System.out.print(Arrays.toString(insertionSort(arr)));
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int[] insertionSort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(nums[j-1] > nums[j]){
                    swap(nums, j-1, j);
                    continue;
                }
                break;
            }
        }
        return nums;
    }
}