import java.util.Scanner;
public class Scoping
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = 10;

        System.out.println(num);   //Similarly, we cant access num in this function as the scope is not with respect to this function.

        //Example of block scope: 
        {
            int c = 1779;
            //Values initialzed in this block will remain in this block
        }
        System.out.println(c);     //This won't print anything as the value of c is in the block above only and it's not defined outside that.

        for(int i=0; i<5; i++){    //here, i is initialized in the loop scope thus, it can only be accessed inside the loop, not outside.
            System.out.print(i + " ");
        }
        System.out.println(i);     //This will give error as i is initialized only in the loop scope.

    }

    static void random(){
        System.out.println(a);     //This won't print anything rather, it will give a error that a is undefined as, the scope of a is defined only to the function it is in.

        int num = 45; 
    }
}