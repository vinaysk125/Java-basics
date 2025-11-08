package Java_Interview_Problems.String;
// Program: Count_Frequency_Of_Characters
// Topic: String
// Description: This program counts the frequency of each character in a given string.
//Enter a string: billi
//        Character frequencies:
//        b : 1
//        i : 2
//        l : 2
import java.util.Scanner;

public class Count_Frequency_Of_Characters {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().replaceAll("\\s", ""); // Remove spaces

        int[] freq = new int[256]; // ASCII character frequency array

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print frequency of each character
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }

        sc.close(); // Close Scanner
    }
}
