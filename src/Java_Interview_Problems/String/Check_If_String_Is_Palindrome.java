package Java_Interview_Problems.String;
// Program: Check_If_String_Is_Palindrome
// Topic: String
// Description: This program checks if a given string is a palindrome.
// A palindrome reads the same forwards and backwards.
// Example -> level -> level
import java.util.Scanner;

public class Check_If_String_Is_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase(); // to lowercase.

        String reversed = ""; // To store reversed string

        // Reverse the string manually
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check if original string equals reversed string
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        sc.close(); // Close Scanner
    }
}