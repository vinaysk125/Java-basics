package Basic_Question_IMP;

import java.util.Scanner;

public class PrintInteger_User {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter you age = ");
        age = sc.nextInt();

        System.out.println("Your age = " + age);

        sc.close();
    }

}
