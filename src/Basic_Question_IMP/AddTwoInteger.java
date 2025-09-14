package Basic_Question_IMP;

import java.util.Scanner;

public class AddTwoInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to add = ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        int addition = firstNumber + secondNumber;

        System.out.println("You entered two number addition is = " + addition);

        sc.close();
    }
}
