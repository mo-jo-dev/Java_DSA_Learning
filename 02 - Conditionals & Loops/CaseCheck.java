import java.util.Scanner;
public class CaseCheck{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);    // Here trim removes all the extra spaces, charAt gives the character at the given index;
        // System.out.println(ch);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper Case");
        }

    }
}