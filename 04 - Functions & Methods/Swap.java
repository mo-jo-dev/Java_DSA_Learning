import java.util.Scanner;
public class Swap
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);    
        
        int a = 10;
        int b = 20;
        System.out.println(a + " " +b);

        // int temp = a;
        // a = b;
        // b = temp;

        swap(a, b);
        System.out.println(a + " " +b);

        String name = "Mohit";
        changename(name);
        System.out.println(name);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void changename(String name){
        name = "Monk";
    }
}