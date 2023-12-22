import java.util.Scanner;
public class Shadowing
{
    int x = 10;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(x);
        int x = 26;
        System.out.println(x);
        fun();

    }

    static void fun(){
        System.out.println(x);
    }
}