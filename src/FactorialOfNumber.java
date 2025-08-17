import java.util.Scanner;
public class FactorialOfNumber {

    // factorial function
    static int factorial(int num) {

        if (num < 0) {
            System.out.println("You returned 0 or negative number");
            return -1;
        }

        int fact = 1;
        for (int i = num; i > 0; i--) {
           {
                fact *= i;
            }
        }
        return fact;
    }

    public static void main(String[] args){
        System.out.println("This is FactorialOfNumber program");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to calculate factorial = ");

        int num = sc.nextInt();

        int result = factorial(num);

        if (result != -1) {
            System.out.println("factorial of number is = " + result);
        }

        sc.close();
    }
}
