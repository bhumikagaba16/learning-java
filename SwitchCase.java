import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
       
        // String fruit = in.next();

        // switch (fruit) {
        //     case "mango":
        //         System.out.println("king of fruits");
        //         break;
        //     case "orange":
        //         System.out.println("this is round fruit");
        //         break;
        //     case "apple":
        //         System.out.println("this is red colour fruit");
        //         break;
        //     default:
        //         System.out.println("enter valid value");
        //         break;
        // }

        // System.out.println("enter nunber for a day: ");
        // int day = in.nextInt();
        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("invalid number of day");
                
        // }

        int day = in.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekdays");    
                break;
            case 6:
            case 7:
                System.out.println("weekends");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
        in.close();
    }
    
}
