import java.util.Scanner;
public class Shadowing                            // When you have one variable initialized in this class scope, and u inititlize the same variable in another function then the class scope gets hidden for that function.
{
    static int x = 10;                            //This will be shadowed at line 8;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(x);
        int x = 26;                               //The class variable at line 4 is showed by this.
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}