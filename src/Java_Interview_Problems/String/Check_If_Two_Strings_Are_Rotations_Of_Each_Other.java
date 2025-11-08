package Java_Interview_Problems.String;
// Program: Check_If_Two_Strings_Are_Rotations_Of_Each_Other
// Topic: String
// Description: This program checks if one string is a rotation of another.
//Enter the first string: abc
//        Enter the second string: bca
//        The strings are rotations of each other.

import java.util.Scanner;
public class Check_If_Two_Strings_Are_Rotations_Of_Each_Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // First, check if lengths are equal, if not they cannot be rotations
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not rotations of each other.");
        } else {
            // Check if str2 is a substring of str1 concatenated with str1
            String combined = str1 + str1; // Concatenate str1 with itself
            if (combined.contains(str2)) {
                System.out.println("The strings are rotations of each other.");
            } else {
                System.out.println("The strings are not rotations of each other.");
            }
        }

        sc.close(); // Close Scanner

    }
}
