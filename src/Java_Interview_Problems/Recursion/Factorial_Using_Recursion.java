package Java_Interview_Problems.Recursion;
// Program: Factorial_Using_Recursion
// Topic: Recursion
// Description: This program calculates the factorial of a number using recursion.
// Factorial of a number n is defined as n! = n * (n-1) * (n-2) * ... * 1
public class Factorial_Using_Recursion {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;  // You can change this value for testing
        System.out.println("Factorial of " + n + " is: " + factorial(n));  // Call the recursive function
    }
}
