package Java_Interview_Problems.String;
// Program: Print_Each_Word_On_New_Line
// Topic: String
// Description: This program prints each word of a sentence on a new line.
// Enter a sentence: vinay is a developer
//        vinay
//        is
//        a
//        developer

import java.util.Scanner;

public class Print_Each_Word_On_New_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words using space as delimiter
        String[] words = sentence.split("\\s+");

        // Loop through each word and print on a new line
        for (String word : words) {
            System.out.println(word);
        }

        sc.close(); // Close Scanner
    }
}
