package Basic_Question_IMP;
import java.util.Scanner;

public class QuetientReminder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number to calculate Quotient and Reminder = ");
        double firstNumber = sc.nextDouble();
        double secondNumber =  sc.nextDouble();

        double quotient = firstNumber / secondNumber;
        double reminder = firstNumber % secondNumber;

        System.out.printf("You entered number quotient = %.4f And Reminder is %.4f = ", quotient, reminder);
        // used printf to format only 4 number after point.

        sc.close();
    }
}
