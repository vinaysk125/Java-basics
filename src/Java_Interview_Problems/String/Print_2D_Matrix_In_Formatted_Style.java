package Java_Interview_Problems.String;
// Program: Check_If_Two_Strings_Are_Anagrams
// Topic: String
// Description: This program checks if two strings are anagrams.
// Anagrams contain the same characters with the same frequency, but order can differ.
// Example listen and silent are anagrams.
import java.util.Scanner;
import java.util.Arrays;

public class Print_2D_Matrix_In_Formatted_Style {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase(); // Remove spaces, convert to lowercase

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        // If lengths differ, they can't be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams.");
        } else {
            // Convert strings to char arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Sort the arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare sorted arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Strings are anagrams.");
            } else {
                System.out.println("Strings are not anagrams.");
            }
        }

        sc.close(); // Close Scanner
    }
}
