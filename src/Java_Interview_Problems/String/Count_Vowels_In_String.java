package Java_Interview_Problems.String;
// Program: Count_Vowels_In_String
// Topic: String
// Description: This program counts the number of vowels in a given string.

import java.util.Scanner;

public class Count_Vowels_In_String {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine().toLowerCase(); // Convert to lowercase for simplicity

    int count = 0;

    // Loop through each character and check if it's a vowel
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }

    System.out.println("Number of vowels in the string: " + count);

    sc.close(); // Close Scanner

    }
}
