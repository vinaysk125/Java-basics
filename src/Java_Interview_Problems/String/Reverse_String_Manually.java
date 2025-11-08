package Java_Interview_Problems.String;
// Program: Reverse_String_Manually
// Topic: String
// Description: This program reverses a string without using StringBuilder or built-in reverse methods.

import java.util.Scanner;
public class Reverse_String_Manually {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            // Loop from the end of the string to the beginning
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }

            sc.close(); // Close Scanner
        }
    }
