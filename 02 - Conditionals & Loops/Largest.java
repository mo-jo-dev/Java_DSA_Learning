import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.print("Input the third number: ");
        int c = in.nextInt();

        //Q - Find the largest of the three numbers.
        int max;
        if(a > b && a > c) max = a;
        else if(b > a && b > c) max = b;
        else max = c;

        System.out.println("The maximum number is: " + max);

        // or we can optimize it using: 

        max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("The maximum number is: " + max);

        // or 

        int maxim = Math.max(Math.max(a, b), c);
        System.out.println("The maximum number is: " + maxim);



    }
}