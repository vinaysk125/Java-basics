package Java_Interview_Problems.Recursion;
// Program: Print_Numbers_From_N_To_1
// Topic: Recursion
// Description: This program prints numbers from N to 1 using recursion.

public class Print_Numbers_From_N_To_1 {
    // Recursive method to print numbers from N to 1
    public static void printNumbers(int n) {
        // Base case: stop recursion when n reaches 1
        if (n < 1) return;

        // Print the current number
        System.out.print(n + " " );

        // Recursively call the method with n-1
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;  // You can change this value for testing
        printNumbers(n);  // Call the recursive function
    }
}
