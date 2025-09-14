package Day3_4_StringArray;

import java.util.Scanner;
public class CountvowelsConsonantsLettersOnly {

    // Function/Method
        static boolean isVowel(char ch){
            ch = Character.toLowerCase(ch);
                return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }

        // Main function
        public static void main (String[]args){

            System.out.println("This is CountVowelsConsonantsLettersOnly program.");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            int vowel = 0;
            int consonant = 0;
            str = str.replaceAll("\\s+","");
            for (int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if(isVowel(ch)) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
            }

            System.out.println("Vowel = " + vowel);
            System.out.println("Consonant = " + consonant);
            sc.close();
        }
}


