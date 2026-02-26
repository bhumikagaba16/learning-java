import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
         Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        int a =in.nextInt();
        System.out.println("enter second number");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("sum is: "+sum);
        in.close();
    }
    
}
