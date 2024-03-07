import java.util.Scanner;

public class Even_Odd_Using_Bitwise
{
    // Here, we need to find whether a number is even or odd by using bitwise operators and in binary representation
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 44;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

}