package Java_Interview_Problems.String;
// Program: Find_Longest_Word_In_Sentence
// Topic: String
// Description: This program finds the longest word in a given sentence.
// Enter a sentence: vinay is java developer
//        Longest word: developer
//        Length: 9

import java.util.Scanner;

public class Find_Longest_Word_In_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words using space as delimiter
        String[] words = sentence.split("\\s+");

        String longestWord = "";
        int maxLength = 0;

        // Loop through all words to find the longest
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + maxLength);

        sc.close(); // Close Scanner
    }

}
