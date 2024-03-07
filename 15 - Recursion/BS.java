import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class BS
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 34, 38, 65, 133, 155, 175};
        System.out.print(bs(arr,0,arr.length-1, 155));
    }

    static int bs(int[] arr, int s, int e, int n){
        if(s > e) return -1;
        int mid = s + (e-s)/2;
        if(n == arr[mid]) return mid;
        else if(n > arr[mid]) return bs(arr, mid+1, e, n);
        else return bs(arr, s, mid-1, n);

    }
}