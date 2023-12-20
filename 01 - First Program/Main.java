import java.util.Scanner;

public class Main{
    public static void main(String[] args){       //int main() in java is like this
        // System.out.println("Hello World!");    //printf or cout of java
        // System.out.println(args[2]);           //it prints the output based on command line
        Scanner input = new Scanner(System.in);   //Scanner is a class in the java.util package. It is used to take input
        System.out.println(input.nextInt());      //Inputs an integer
        System.out.println(input.next());         //Inputs the first word of a sentence
        System.out.println(input.nextLine());     //Inputs the whole sentence
    }
}