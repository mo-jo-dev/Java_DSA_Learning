import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Fibo
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print(fibo(6));
    }

    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}