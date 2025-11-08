import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeDemo {
public static void main(String[] args) {
// First not repeating character in string

    String s = "Hello Vinay";

    for (int i=s.length()-1; i>=0; i--) {
        char ch = s.charAt(i);
        System.out.print(ch + " ");
    }
}
}
