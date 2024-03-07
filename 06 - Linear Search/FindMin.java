import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class FindMin
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {123,435,112,242,5326,313};
        System.out.print(find(arr));
    }

    static int find(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
}