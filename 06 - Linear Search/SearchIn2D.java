import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class SearchIn2D
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = {
            {1, 2,},
            {6, 2123,124,14},
            {214,442,42}
        };
        int target = 124;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int max(int[][] arr){
        int max = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}