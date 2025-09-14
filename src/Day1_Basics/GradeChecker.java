package Day1_Basics;
import java.util.Scanner;

public class GradeChecker {
    public static void main(String [] args){

        System.out.println("This is GradeChecker program.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a marks between 0-100 = ");
        int marks = sc.nextInt();
        String grade;

        if (marks >= 90){
            grade = "Grade A";
        } else if (marks >= 75) {
            grade= "Grade B";
        } else if (marks >= 50) {
            grade = "Grade C";
        } else {
            grade = "Grade D";
        }
        switch (grade) {
            case "Grade A":
                System.out.println("Grade A");
                break;
            case "Grade B":
                System.out.println("Grade b");
                break;
            case "Grade C":
                System.out.println("Grade C");
                break;
            case "Grade D":
                System.out.println("You are FAIL! BETTER LUCK NEXT TIME");
                break;
            default:
                System.out.println("Wrong input");

        }
    }
}
