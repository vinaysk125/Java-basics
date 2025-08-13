import java.util.Scanner;

public class UserProfileInput {
    public static void main(String [] args){

        System.out.println("This is UserProfileInput program.");

        Scanner sc = new Scanner((System.in));

        System.out.println("Enter the Name = ");
        String name = sc.nextLine();


        System.out.println("Enter your age = ");
        int age = sc.nextInt();

        System.out.println("Enter your marks in point = ");
        float marks = sc.nextFloat();

        System.out.println("Enter you gender (Male=true/Female=false) ? = ");

        boolean gender = sc.nextBoolean();
        System.out.println("Your name = " + name + ", your age = " + age + ", your marks = " + marks + ", your gender = " + gender);

    }
}
