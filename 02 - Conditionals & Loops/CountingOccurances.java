import java.util.Scanner;
public class CountingOccurances{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original number and the number whose occurance you want: ");
        int num = in.nextInt();
        int key = in.nextInt();
        int count = 0;
        while(num!=0){
            int rem = num % 10;
            if(rem == key) count++;
            num = num/10;
        }
        System.out.println(count);
    }
}