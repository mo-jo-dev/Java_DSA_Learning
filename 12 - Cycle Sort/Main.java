import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {5, 4, 3, 2, 1};
        cycleSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void cycleSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

    }
}