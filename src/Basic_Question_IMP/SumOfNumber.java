package Basic_Question_IMP;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count sum of numbers");
        int n = sc.nextInt();

        int sum = 0;
        for (int i=0; i<=n; i++){
            sum = sum +i;
        }
        System.out.println("Sum of count is = " + sum);
        sc.close();
    }
}
