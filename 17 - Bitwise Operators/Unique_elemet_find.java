import java.util.Scanner;

public class Unique_elemet_find{
    public static void main(String[] args){
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(one(arr));
    }

    private static int one(int[] arr){
        int unique = 0;

    for(int n: arr){
        unique ^= n;
    }

        return unique;
    }

}