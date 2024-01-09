import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // No. of lines = No. of rows = No. of lines outer loop will run

        pattern1(4);
    }

    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            // For every row, run the col
            for(int col = 1; col <= row; col++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}