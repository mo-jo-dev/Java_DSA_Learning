import java.util.Scanner;
public class Sum
{
    public static void main(String[] args){
        sum();
        System.out.println(sum1());
        System.out.println(sum2(5,5));
    }

    /*
        access modifier(Will discuss in OOPS) return_type name(arguements){
            //body
            return  statement;
        }
    */

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of num1 and num2 is: " + sum);
    }

    // For specifying the return type, we have

    static int sum1(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }

    static int sum2(int a, int b){
        return a+b;
    }
}