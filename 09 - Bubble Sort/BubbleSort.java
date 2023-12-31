import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class BubbleSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {5, 4, 3, 2, 1};
        System.out.print(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean check = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    check = true;
                }
            }
            if(!check){
                break;
            }
        }
        return arr;
    }
}