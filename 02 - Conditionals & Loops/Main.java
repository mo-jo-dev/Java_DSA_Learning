import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        /*
            Syntax of if - else statements:
            if(boolean expression T or F){
                //body
            }
            else{
                // do this
            }
        */
        int salary = 25400;
        if(salary > 10000){
            salary += 10000;
        }
        else if(salary<5000){
            salary += 15000;
        }
        else{
            salary += 20000;
        }
        System.out.println(salary);
    }
}