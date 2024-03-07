import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);


        int a = 10; //Here a is the identifier and 10 is the literal

        int b = 2_50_00_000; //This is how we can write 2,50,00,000
        System.out.println(b);

        String name = input.next();
        System.out.println(name);
    }
}