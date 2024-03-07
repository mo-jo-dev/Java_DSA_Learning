import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T1 = 0;
        int T2 = 1;
        int i = 2, T3 = 0;
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        while(i <= n){
            T3 = T2;
            T2 = T1 + T2;
            T1 = T3;
            i++;
        }
        System.out.println("The value at n = " + n + " is: " + T3);
    }
}