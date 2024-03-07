import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class SearchInRange
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2, 3,4, 5,6,7};
        System.out.print(sir(arr, 5, 2, 6));
    }

    static boolean sir(int[] arr, int target, int a, int b){
        for(int i = a; i < b; i++){
            if(target == i) return true;
        }
        return false;
    }
}