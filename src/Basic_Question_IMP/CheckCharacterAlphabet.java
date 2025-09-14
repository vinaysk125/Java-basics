package Basic_Question_IMP;

import java.util.Scanner;

public class CheckCharacterAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character to check it is alphabet ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        System.out.println((ch>= 'a' && ch <= 'z') ? "It's alphabet" : "Not a alphabet");

        sc.close();
    }
}
