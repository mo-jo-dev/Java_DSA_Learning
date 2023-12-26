import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Swap
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.print(`Namaste World`);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        swapno(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swapno(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}