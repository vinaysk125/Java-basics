package Java_Interview_Problems.Recursion;
// Program: Reverse_Integer_Without_Converting_To_String
// Topic: Recursion
// Description: This program reverses an integer without converting it to a string using recursion.
public class Reverse_Integer_Without_Converting_To_String {
    // Helper method to reverse the number
    public static int reverse(int n, int rev) {
        // Base case: when the number becomes 0, return the reversed number
        if (n == 0) {
            return rev;
        }

        // Recursive case: add the last digit to the reversed number
        rev = rev * 10 + n % 10;

        // Call the function with the number without the last digit
        return reverse(n / 10, rev);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reversed number: " + reverse(num, 0));  // Start with rev = 0
    }
}
