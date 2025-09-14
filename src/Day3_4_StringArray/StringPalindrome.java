package Day3_4_StringArray;

import java.util.Scanner;
    public class StringPalindrome {

        static boolean checkPalindrome(String name) {
            int start = 0;
            int end = name.length() - 1;
            while (start < end) {
                if (name.charAt(start) != name.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

            public static void main (String[]args){

                System.out.println("This is StringPalindrome program.");

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter string to check it's palindrome = ");
                String name = sc.nextLine();

                boolean result = checkPalindrome(name.toLowerCase());

                if (result == true) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not palinfrom");
                }
                sc.close();
            }
    }