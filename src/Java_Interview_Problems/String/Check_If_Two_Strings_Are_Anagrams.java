package Java_Interview_Problems.String;
// Program: Check_If_Two_Strings_Are_Anagrams
// Topic: String
// Description: This program checks if two strings are anagrams of each other.
// Enter the first string: listen
//        Enter the second string: silent
//        Strings are anagrams.
import java.util.Arrays;
import java.util.Scanner;

public class Check_If_Two_Strings_Are_Anagrams {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase(); // Remove spaces and lowercase
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams.");
        } else {
            // Convert strings to char arrays and sort them
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

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
