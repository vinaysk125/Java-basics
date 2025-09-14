package Basic_Question_IMP;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to calculate factorial = ");

        int n = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact = fact * i;
        }
        System.out.println("Factoral of " + n + " = " + fact);

        sc.close();
    }
}
