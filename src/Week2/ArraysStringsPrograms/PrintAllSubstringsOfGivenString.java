package Week2.ArraysStringsPrograms;
//  Print all substrings of a given string
public class PrintAllSubstringsOfGivenString {
public static void main (String[] args) {
//    💡 Logic / Explanation
//    Let’s first recall what a substring means:
//    A substring is a continuous part of a string.
//            For "ABC":
//    Start at index 0 → A, AB, ABC
//    Start at index 1 → B, BC
//    Start at index 2 → C
//    So, we use two loops:
//    Outer loop → starting index of substring
//    Inner loop → ending index of substring
//    Use str.substring(start, end) to print that substring.

        String str = "ABCD";
        printSubstrings(str);
}

    public static void printSubstrings(String str) {
        int n = str.length();

        // Outer loop for start index
        for (int start = 0; start < n; start++) {
            // Inner loop for end index
            for (int end = start + 1; end <= n; end++) {
                System.out.println(str.substring(start, end));
            }
        }
}
}
