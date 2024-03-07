import java.util.Arrays;
import java.util.Scanner;
public class VarArgs
{
    public static void main(String[] args){
        fun(2, 3, 4, 5, 6 ,2 );
    }

    static void fun(int ...v){          //We can give any number of input, i.e. array.... this is the beauty of variable length arguements
        System.out.println(Arrays.toString(v));
    }
}