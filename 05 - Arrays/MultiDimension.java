import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        /*
            1 2 3
            4 5 6
            7 8 9
         */

         //Syntax
         int[][] marray = new int[3][3];

        //  or

        int[][] marr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // Print 2d array for fixed rows and columns.

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(marr[i][j] + " ");
        //     }
        //     System.out.println("\n");
        // }

        int[][] arr2 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for(int i=0;i<arr2.length;i++){
            for(int j = 0;j < arr2[i].length;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // or -> enhanced

        for(int[] i: arr2){
            System.out.print(Arrays.toString(i));
        }
    }
}