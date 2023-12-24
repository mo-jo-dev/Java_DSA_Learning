import java.util.Arrays;
import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isPrime(num);
    }

    static void isPrime(int num){
        int n = num/2, i = 2;
        int count = 0;
        while(i != n){
            if(num%i == 0){
                count = 1;
                break;
            }
            i++;
        }
        if(count == 0){
            System.out.print("Prime number");
        }
        else if(count == 1 || num <= 1){
            System.out.print("Not a prime number");
        }
    }
}