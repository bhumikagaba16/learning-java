import java.util.Scanner;
public class Simple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter your salary");
        int a = in.nextInt();
        if(a>=20000){
            a+=2000;
        }else{
            a+=1000;
        }
        System.out.println(a);
        in.close();
    }
    
}
