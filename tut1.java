import java.util.Scanner;

public class tut1{
    public static void main(String[] args) {
        //taking input from user using Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String Name = sc.nextLine();

        System.out.println("Enter your Age");
        int age = sc.nextInt();

        System.out.println("Enter your Gender");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your Mobile no.");
        long num = sc.nextLong();

        System.out.println("Enter your education");

        System.out.println("*********Your Information*********");

        System.out.println("Name = " + Name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("Mobile NO. = " + num);
        



        
    }
}