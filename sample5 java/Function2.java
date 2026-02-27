import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        int ans =sum2();
        System.out.println(ans);
    }
    static int sum2(){
         Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        int a =in.nextInt();
        System.out.println("enter second number");
        int b = in.nextInt();
        int sum = a+b;
        in.close();
        
        return sum;
        
        
    }
    
}
