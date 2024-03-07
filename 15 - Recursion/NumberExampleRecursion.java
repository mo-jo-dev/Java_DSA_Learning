import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class NumberExampleRecursion
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        print(1);
    }

    static void print(int n){

        System.out.println(n);
        if(n == 5) {
            return;
        }
        print(n+1);
    }
}