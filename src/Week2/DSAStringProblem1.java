package Week2;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class DSAStringProblem1 {
    public static void main(String[] args) {
//    Problems
//    Check if string is palindrome
//    Check if two strings are anagrams
//    Count frequency of characters
//    Remove duplicates from string
//    Find longest word in a sentence

        //    Check if string is palindrome - We can use two pointer
        String palindrome = "Detartrated";
        int start = 0;
        int end = palindrome.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (palindrome.toLowerCase().charAt(start) != palindrome.toLowerCase().charAt(end)) {
                isPalindrome = false;
                break;
            } else {
                start++;
                end--;
            }
        }
        if (isPalindrome) {
            System.out.println(palindrome + " is palindrome string");
        } else {
            System.out.println(palindrome + " is not palindrome string");
        }

//    Check if two strings are anagrams
        String str1 = "Listen";
        String str2 = "Silent";

        // Step 1: Convert to lowercase and remove spaces
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        // Step 2: If lengths are not equal, they can't be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Step 3: Convert to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Step 4: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 5: Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        //    Count frequency of characters

        String str = "programming";
        // Create an array to store frequency
        int[] fre = new int[26];
        // Count frequency of each character
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                 fre[ch - 'a']++;
            }
        }
        // Print frequencies
        for (int i=0; i<26; i++) {
            if (fre[i] > 0) {
                System.out.println((char) (i + 'a') + " = " + fre[i]);
            }
        }
                // Remove duplicates from string
        String str3 = "ASSDA";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str3.length(); i++) {
            char ch = str3.charAt(i);

            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println("Without Duplicates: " + result);

        // Find longest word in a sentence


    }

}