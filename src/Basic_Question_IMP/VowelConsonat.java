package Basic_Question_IMP;
import java.util.Scanner;


public class VowelConsonat {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character to check vowel or consonant = ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is consonant");
        }

        sc.close();
    }
}
