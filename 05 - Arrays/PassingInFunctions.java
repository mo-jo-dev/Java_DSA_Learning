import java.util.Arrays;
import java.util.Scanner;
public class PassingInFunctions
{
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));        
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void fun(int[] arr){
        arr[2] = 232;

        //Arrays are mutable i.e. they can be changed while strings are immutable in java
    }
}