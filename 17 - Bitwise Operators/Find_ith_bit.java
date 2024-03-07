import java.util.Scanner;

public class Find_ith_bit{
    public static void main(String[] args){
        int n = 5;
        int num = 157;
        System.out.println(checkPos(n, num));
    }

    private static int checkPos(int n, int num){
        return num & (1 << (n-1));
    }
}