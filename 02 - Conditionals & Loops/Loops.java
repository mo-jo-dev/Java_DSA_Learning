import java.util.Scanner;
public class Loops{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*
            Syntax for for loop:

            for(initialization; condition; increment/decrement){
                // body;
            }
        */
        for(int num = 1; num < 5; num++){
            System.out.println(num);
        }

        int n = in.nextInt();
        for(int val = 1; val <= n; val++){
            System.out.print(val + " ");
        }

        //While numbers
        /*
            Syntax: 
            while (condition) {
                // body
            }
         */

         int num = 1;
         while(num<5){
             System.out.println(num);
             num++;
         }

         //do while
         /*
            do {
                
            } while(condition);
         */

         int n1 = 1;
         do{
             System.out.println(n1);
             n1++;
         }while(n1<5);

    }
}