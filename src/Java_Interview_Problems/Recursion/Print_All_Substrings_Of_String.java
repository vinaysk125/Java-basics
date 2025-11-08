package Java_Interview_Problems.Recursion;
// Program: Print_All_Substrings_Of_String
// Topic: Recursion
// Description: This program prints all possible substrings of a given string using recursion.
public class Print_All_Substrings_Of_String {
        // Recursive method to print all substrings
        public static void printSubstrings(String str, int start, int end) {
            // Base case: if start index exceeds string length, stop recursion
            if (start == str.length()) {
                return;
            }

            // Print all substrings starting from the current index
            for (end = start + 1; end <= str.length(); end++) {
                System.out.println(str.substring(start, end));
            }

            // Recursively call to print substrings starting from the next index
            printSubstrings(str, start + 1, start + 1);
        }

public static void main(String[] args) {
            String str = "abc";
            printSubstrings(str, 0, 0);  // Start from index 0
        }
    }
