import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Operators
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + 1);
        System.out.println('a' + 1);
        // Integer will call toString i.e concatination
        System.out.println("a" + new ArrayList<>());

        // Operator + is only valid when both are primitives or any one operand is string
    }
}