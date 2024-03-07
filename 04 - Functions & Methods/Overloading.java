import java.util.Arrays;
import java.util.Scanner;
public class Overloading
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        fun(12);
        fun();   //This will give error which is known as ambiguity, i.e it cant decide which function to run
    }

    // Two or more functions of the same name can exist if the arguements given to them are different.

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }
}