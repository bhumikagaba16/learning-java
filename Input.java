import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

         int[]arr=new int [5];
        // arr[0]=66;
        // arr[1]=34;
        // arr[2]=78;
        // arr[3]=56;
        // arr[4]=75;

        // System.out.println(arr[2]);

        for (int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }
        // for(int i =0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        // for(int num : arr){
        //     System.out.print(num + " ");
        // }
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    
}
