import java.util.Scanner;

public class Function5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter you name");
        String name =in.next();
        String line = greets(name);
        System.out.println(line);
        in.close();
    }
    static String greets(String name){
        String greetline ="hello "+ name;
        return greetline;
    }
}
