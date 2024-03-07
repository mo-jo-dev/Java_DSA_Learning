import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.print(`Namaste World`);

        /*
            // Syntax
            ArrayList<Integer> list = new ArrayList<>();        
         */
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(124);
        list.add(122);
        list.add(1);
        list.add(24);
        list.add(4);
        list.add(14);
     
        System.out.print(list + " ");

        System.out.println(list.contains(122));   //Will give true as 122 is in the array.

        list.set(0, 1234);
        System.out.print(list + " ");

        list.remove(2);
        System.out.print(list + " ");

    }
}