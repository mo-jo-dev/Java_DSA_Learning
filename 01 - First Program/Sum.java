
import java.util.Scanner;
public class Sum{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int val1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int val2 = input.nextInt();
        int sum = val1 + val2;
        System.out.println("The sum of val1 and val2 is " + sum);
    }
}