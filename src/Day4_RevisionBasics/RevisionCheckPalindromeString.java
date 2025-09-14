package Day4_RevisionBasics;

import java.util.Scanner;
public class RevisionCheckPalindromeString {
    public static void main(String[] args){
        System.out.println("This is RevisionCheckPalindromeString program.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name to check palindrome = ");
        String name = sc.nextLine();

        int start = 0;
        int end = name.length() - 1;

        boolean isPalindrome =  true;

        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
