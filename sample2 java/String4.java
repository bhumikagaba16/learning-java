import java.util.Scanner;
public class String4 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Order Name: ");
        String orderName =sc.nextLine();
        //output
        String fullName = customerName+" ordered "+orderName+" from 5 STAR restaurant. ";

        System.out.println(fullName);
        sc.close();
    }
    
}
