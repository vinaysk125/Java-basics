package Java_Interview_Problems.String;

// Program: Remove_Duplicates_From_String
// Topic: String
// Description: This program removes duplicate characters from a given string.

import java.util.Scanner;
public class Remove_Duplicates_From_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String result = ""; // To store string without duplicates

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If character is not already in result, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);


        sc.close();
    }
}