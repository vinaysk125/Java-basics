package Basic_Question_IMP;

import java.util.Scanner;

public class NumberPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check positive or negative = ");
        int num = sc.nextInt();
        checkNumber(num);

        sc.close();
    }

        public static void checkNumber(int number) {
            if (number == 0) {
//              System.out.println("You entered 0");
                return;
            } else {
                System.out.println((number > 0) ? "positive" : "Negative");
            }
        }
}
