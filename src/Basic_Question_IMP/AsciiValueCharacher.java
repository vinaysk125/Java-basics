package Basic_Question_IMP;

import java.util.Scanner;

public class AsciiValueCharacher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to calculate Ascii value = ");

        char ch = sc.next().charAt(0); // To get single character use object.next().charAt(0);

        //int ascii_value = ch; -> Type casting convert char into int.

        System.out.println("You entered " + ch + " Ascii value is = " + (int) ch);

        sc.close();

    }
}

