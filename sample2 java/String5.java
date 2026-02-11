import java.util.Scanner;
public class String5 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Mathematics: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter Marks of Physics: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter Marks of Chemistry: ");
        int marks3 = sc.nextInt();

        int total = marks1 + marks2 + marks3;

        int percent = (marks1 + marks2 + marks3)/3;

        String output = "Student Name: ".concat(name)
                        .concat("\nMathematics Marks: ").concat(String.valueOf(marks1))
                        .concat("\nPhysics Marks: ").concat(String.valueOf(marks2))
                        .concat("\nChemistry Marks: ").concat(String.valueOf(marks3))
                        .concat("\nTotal Marks: ").concat(String.valueOf(total))
                        .concat("\nPercentage: ").concat(String.valueOf(percent));
        
        System.out.print("\nResult of "+name);
        System.out.println("\n"+output);
        sc.close();

    }
    
}
