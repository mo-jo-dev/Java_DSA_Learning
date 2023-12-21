import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // Either we use String.equals("Mango") to check which case is their or we can use the switch case
        // i.e.

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits!!");
                break;
            case "Apple":
                System.out.println("Sweet red fruit!!");
                break;
            case "Orange":
                System.out.println("Orange queen!!");
                break;
            case "Grapes":
                System.out.println("Fruit also known as goton ka sardaar!!");
                break;
            default:
                System.out.println("Please enter a valid fruit!!!");
        }


        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tueday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}