package Week2;

import java.util.Arrays;

public class String1 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("_World");

        System.out.println(s1 + s2);           // Concatenates two strings
        System.out.println(s2);                // Prints the string value
        System.out.println(s1.concat("_Hello")); // Concatenate two string

        System.out.println(s1.length());       // Returns the length of the string
        System.out.println(s1.charAt(4));      // Returns character at given index
        System.out.println(s1.toLowerCase());  // Converts all characters to lowercase
        System.out.println(s1.toUpperCase());  // Converts all characters to uppercase
        System.out.println(s1.substring(2,5)); // Returns substring from index 2 to 4
        System.out.println("HEllo".equals(s1));         // Compares two strings (case-sensitive)
        System.out.println("HEllo".equalsIgnoreCase(s1)); // Compares two strings ignoring case
        System.out.println(s1.contains("llo")); // Checks if substring exists in string
        System.out.println(Arrays.toString(s1.split("e")));  // Splits string around matches of the given regex
        System.out.println(s1); // Prints the string again
    }
}
