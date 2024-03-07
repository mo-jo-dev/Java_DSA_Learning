import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Q - Write the code to print the sum of two numbers for 100 times:
        int num1, num2, sum;
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of num1 and num2 is: " + sum);
        //We cant write this code a 100 times so, we have functions/methods for that. Functions when written inside a class are known as methods.
        
    }
}