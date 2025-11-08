package Java_Interview_Problems.Recursion;
// Program: Fibonacci_Recursion
// Topic: Recursion
// Description: This program calculates the Nth Fibonacci number using recursion.
// Fibonacci sequence: Fib(n) = Fib(n-1) + Fib(n-2), with base cases Fib(0) = 0 and Fib(1) = 1.

public class Fibonacci_Recursion {
    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case: Fibonacci of n is the sum of Fibonacci of (n-1) and (n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;  // You can change this value for testing
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));  // Call the recursive function
    }
}
