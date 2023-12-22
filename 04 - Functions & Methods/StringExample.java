import java.util.Scanner;
public class StringExample
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(greet());
        System.out.println(greet1("Hello Ji"));
    }

    static String greet(){
        return "Namaste User";
    }

    static String greet1(String greeting){
        return greeting;
    }
}