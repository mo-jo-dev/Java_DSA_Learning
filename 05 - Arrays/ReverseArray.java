import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ReverseArray
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.print(`Namaste World`);

        int[] arr = {1, 2, 2, 41, 3141, 343};

        System.out.print(Arrays.toString(arr));
        rev(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void rev(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}