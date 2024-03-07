import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int ans = 0;
        // Take the input from the user till the user does not print X or x
        while(true){
            System.out.print("Enter the operator: ");
            char op =  in.next().trim().charAt(0);
            if(op == '+' || op == '*' || op == '-' || op == '/' || op == '%'){
                //input two numbers: 
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                else if(op == '-'){
                    ans = num1 - num2;
                }
                else if(op == '*'){
                    ans = num1 * num2;
                }
                else if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                else if(op == '%'){
                    ans = num1 % num2;
                }
            }
            else if(op != 'X' || op != 'x'){
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }
            System.out.println("The answer is: " + ans);
        }
    }
}