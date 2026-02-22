import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "orange":
                System.out.println("this is round fruit");
                break;
            case "apple":
                System.out.println("this is red colour fruit");
                break;
            default:
                System.out.println("enter valid value");
                break;
        }
    }
    
}
