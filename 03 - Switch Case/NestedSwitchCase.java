import java.util.Scanner;
public class NestedSwitchCase{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId){
            case 1:
                System.out.println("Mohit Joshi");
                break;
            case 2:
                System.out.println("Harishankar");
                break;
            case 3:
                System.out.println("Employee Number 3");
                switch(department){
                    case "EC":
                        System.out.println("EC Department");
                        break;
                    case "CS":
                        System.out.println("CS Department");
                        break;
                    default:
                        System.out.println("No department Entered");
                }
                break;
            default:
                System.out.println("Enter correct Employee Id");
        }       

    }
}