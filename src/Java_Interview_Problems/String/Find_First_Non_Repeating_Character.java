package Java_Interview_Problems.String;
// Program: Find_First_Non_Repeating_Character
// Topic: String
// Description: This program finds the first non-repeating character in a string.
//Enter a string: aabbccd
//        The first non-repeating character is: d

import java.util.Scanner;

public class Find_First_Non_Repeating_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256]; // Array to store frequency of characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find the first character with frequency 1
        char firstNonRepeating = '-'; // Default character if no non-repeating found
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                firstNonRepeating = str.charAt(i);
                break; // Exit loop once the first non-repeating character is found
            }
        }

        // Output the result
        if (firstNonRepeating != '-') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close(); // Close Scanner
    }
}
