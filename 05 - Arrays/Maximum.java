import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Maximum
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.print(`Namaste World`);

        int[] arr = {1, 232, 13, 431, 51, 34};
        System.out.println(Arrays.toString(arr));
        int maxi = max(arr);
        System.out.println(maxi);

    }

    static int max(int[] arr){
        int maxi = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxi) maxi = arr[i];
        }

        return maxi;
    }
}