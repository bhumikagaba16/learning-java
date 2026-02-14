public class Array1 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4};
        //agar sirf arr print kre g to memory address print hogi bs
        System.out.println(arr);

        //element print krvane ke liye loop use krna hoga
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        //ya pr Arrays.toString() use krke
        System.out.println(java.util.Arrays.toString(arr));

    }
    
}
