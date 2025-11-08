package Java_Interview_Problems.String;
// Program: Print_All_Substrings_Of_Given_String
// Topic: String
// Description: This program prints all possible substrings of a given string.
//Enter a string: ABC
//        A	AB	ABC	B	BC	C
import java.util.Scanner;
public class Print_All_Substrings_Of_Given_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Loop over the string to generate all substrings
        for (int start = 0; start < str.length(); start++) {
            for (int end = start + 1; end <= str.length(); end++) {
                // Print each substring
                System.out.print(str.substring(start, end) + "\t");
            }
        }

        sc.close(); // Close Scanner
    }
}
