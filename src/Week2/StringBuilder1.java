package Week2;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vinay");
        sb.append(" Developer");
        System.out.println(sb);
        sb.insert(0, 'B');
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb);

//        Take a sentence and print each word on a new line.
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }


//        Count number of vowels in a string.
        StringBuilder sb1 = new StringBuilder("VINAY");
        String lower = sb1.toString().toLowerCase();
        int countVowel = 0;
        for (int i=0; i<sb1.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                countVowel++;
            }
        }
        System.out.println("Count of vowels in String sb1 = " + countVowel);

//        Reverse a string manually (without StringBuilder).
        for (int i=lower.length()-1; i>=0; i--) {
            System.out.print(lower.charAt(i));
        }
    }
}
