import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class PrettyPrinting
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float a = 456.55568f;
        System.out.printf("Formatted number is %.2f", a);          // here printf is used to represent formatted string

        System.out.printf("PIE: %.3f", Math.PI);

        System.out.printf("Hello my name is %s and I am %s", "Mohit", "Cool");
    }
}