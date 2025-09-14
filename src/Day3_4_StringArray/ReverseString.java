package Day3_4_StringArray;

import java.util.Scanner;

public class ReverseString {

    // Function/Method
    static String reverseString(String str) {
        char[] s = str.toCharArray();
        int start = 0;
        int end = s.length - 1;
        while (start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return new String(s);
    }
    // Main function
    public static void main(String[] args) {
        System.out.println("This is ReverseString program.");
        System.out.print("Enter string to reverse it = ");
        Scanner sc = new Scanner((System.in));
        String str = sc.nextLine();

        System.out.println("Revers string = " + reverseString(str));
    }
}
