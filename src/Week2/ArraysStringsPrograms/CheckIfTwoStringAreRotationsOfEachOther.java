package Week2.ArraysStringsPrograms;
//Check if two strings are rotations of each other
public class CheckIfTwoStringAreRotationsOfEachOther {
public static void main (String[] args) {
//    ⚙️ Steps:
//    Check if lengths are equal.
//            If not → directly return false.
//            Concatenate s1 + s1.
//            Check if s2 exists inside the new string using .contains().

    String s1 = "ABCD";
    String s2 = "DABC";

    boolean result = areRotations(s1, s2);
    System.out.println("Are Rotations? " + result);
}

    public static boolean areRotations(String s1, String s2) {
        // Step 1: If lengths differ, not possible
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Concatenate s1 with itself
        String combined = s1 + s1;

        // Step 3: Check if s2 is a substring of combined
        return combined.contains(s2);
}
}
