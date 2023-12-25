import java.util.Arrays;
import java.util.Scanner;
public class Input
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Array of primitives
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 11;
        arr[2] = 111;
        arr[3] = 1111;
        arr[4] = 11111;

        System.out.println(arr[3]);

        //For long data, we use for loop

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }


        //We can use the for loop to print the data;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n");

        //We can use the foreach loop to print the data;
        for(int num:arr){      //Here num represents the element of the array //For every element in the array, print the array
            System.out.print(num + " ");
        }

        System.out.print("\n");

        // System.out.println(arr[5]);   //Here, index is out of bond

        //We can use the arrays.toString method to print the data;
        System.out.println(Arrays.toString(arr));

        System.out.print("\n");

        //Array of objects.
        String[] str = new String[6];
        for(int i=0;i<str.length;i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

    }   
}