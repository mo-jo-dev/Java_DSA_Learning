import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Methods
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = "Mohit Joshi";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('h'));
    }
}