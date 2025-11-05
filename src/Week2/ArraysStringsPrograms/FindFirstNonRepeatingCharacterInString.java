package Week2.ArraysStringsPrograms;
// Find first non-repeating character in string
public class FindFirstNonRepeatingCharacterInString {
public static void main(String[] args) {
    String str = "swiss";
    char result = findFirstNonRepeating(str);

    if (result != '\0') {
        System.out.println("First non-repeating character: " + result);
    } else {
        System.out.println("No non-repeating character found.");
    }
}

    public static char findFirstNonRepeating(String str) {
        int[] count = new int[256];  // for all ASCII chars

        // Step 1: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        // Step 2: Find first char with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // means none found
}
}
