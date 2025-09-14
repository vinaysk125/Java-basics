package Basic_Question_IMP;

import java.util.Scanner;

public class MultiplyFloatingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two floating number to multiply = ");

        float firstNumber = sc.nextFloat();
        float secondNumber = sc.nextFloat();

        float multiply = firstNumber * secondNumber;

        System.out.println("You entered two floating number multiplication is = " + multiply);

        sc.close();
    }

}
