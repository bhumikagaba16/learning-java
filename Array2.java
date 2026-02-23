import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        int[]arr =new int[4];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(arr);
    }
    
}
