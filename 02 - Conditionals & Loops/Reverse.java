import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original number whose reverse you want: ");
        int num = in.nextInt();
        int rev = 0, rem = 0;
        while(num!=0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}