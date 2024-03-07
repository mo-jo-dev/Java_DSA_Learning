import java.util.Arrays;
import java.util.Scanner;
public class ArmstrongNumbers
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);

        //Print all the 3 digit armstrong numbers;
        for(int i=100;i<1000;i++){
            if(isArmstrong(i) == true){
                System.out.println(i);
            }
        }


    }

    //Check whether a 3 digit number is armstrong number or not
    static boolean isArmstrong(int num){
        int sum = 0;
        int rem = 0;
        int cube = 0;
        int og = num;
        while(num>0){
            rem = num%10;
            cube = rem * rem * rem;
            sum += cube;
            num = num/10;
        }
        return sum == og;
    }
}