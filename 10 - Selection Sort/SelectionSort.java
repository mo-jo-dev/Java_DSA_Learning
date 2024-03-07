import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class SelectionSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {5, 4, 3, 2, 1};
        System.out.print(Arrays.toString(selectionSort(arr)));
    }

    static int findMax(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length-i-1;
            int max = findMax(arr, 0, last);
            swap(arr, max, last);
        }
        return arr;
    }
}