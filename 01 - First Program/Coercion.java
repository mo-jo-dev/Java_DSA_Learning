import java.util.Scanner;
public class Coercion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();                  //even if we give integer, we get a float as int < float
        // System.out.println(num);

        // Type Casting 
        int val = (int)(65.55f);

        // Automatic type promotion in expressions;
        int a = 257;
        byte b = (byte)(a);          //This will give 256%257 = 1
        System.out.println(b);
    }
}