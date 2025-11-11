package Java_Collections_Framework_And_Streams.Iteration_Sorting_Comparator_And_Comparable.Sorting_Basics_with_Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(20,40,10,30));
        System.out.println("Original: " + numbers);

        Collections.sort(numbers); // Ascending order
        numbers.sort((o1, o2) -> o2-o1); // Descending order
        numbers.sort((o1, o2) -> o1-o2); // Ascending order
        System.out.println("Ascending: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder()); // Descending order
//      // numbers.sort(Collections.reverseOrder()); // Descending order
        System.out.println("Descending: " + numbers);

        // Using in String
        System.out.println("\n--------------- Using in string ---------------");
        List<String> names = new ArrayList<>(List.of("Karan", "Vinay", "Rohit", "Amit"));
        System.out.println("Before sorting: " + names);

        Collections.sort(names);
        System.out.println("After sorting (A-Z): " + names);
    }
}
