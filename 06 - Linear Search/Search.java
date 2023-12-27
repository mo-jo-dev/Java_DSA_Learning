import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Search
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.print(`Namaste World`);

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int ans = ls(arr, 5);

        System.out.println(ans);

        int ans2 = lstarget(arr, 5);

        System.out.println(ans2);

        boolean ans3 = ls2(arr, 5);

        System.out.println(ans3);

    }

    static boolean ls2(int[] arr, int target){
        for(int i: arr){
            if(i == target) return true;
        }
        return false;
    }

    static int lstarget(int[] arr, int target){
        int rettar;
        for(int i:arr){
            if(i == target){
                rettar = target;
                break;
            }
        }
        return Integer.MAX_VALUE;
    }

    static int ls(int[] arr, int target){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        return index;
    }
}