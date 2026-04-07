public class LinearSearch2 {
    public static void main(String[] args) {
        String name = "bhumika";
        char target ='i';
        System.out.println(search(name,target));
    }
    static boolean search(String name, char target){
        if (name.length() == 0){
            return false;
        }

        for(int value =0; value<name.length(); value++){
            if (target == name.charAt(value)) {
                return true;
            }
        }
        return false;
        
    }
}
