package Day4_RevisionBasics;

import java.util.Scanner;
public class RevisionCountVowelAndConsonant {
    public static void main(String[] args){
        System.out.println("This is RevisionCountVowelAndConsonant program.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name to check Count of Vowel and Consonant = ");

        String name = sc.nextLine();

        int vowel = 0;
        int consonant = 0;

        name = name.toLowerCase(); // To lowercase all character in string

        for (int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println("Vowel = " + vowel);
        System.out.println("Consonant = " + consonant);
    }
}
