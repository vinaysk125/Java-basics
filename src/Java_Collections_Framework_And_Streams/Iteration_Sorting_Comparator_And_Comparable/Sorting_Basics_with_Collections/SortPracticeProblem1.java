package Java_Collections_Framework_And_Streams.Iteration_Sorting_Comparator_And_Comparable.Sorting_Basics_with_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//  Create ArrayList<String> of countries and sort alphabetically.
public class SortPracticeProblem1 {
    static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(List.of("India", "America", "Japan", "Gulf"));
        System.out.println(countries);

        Collections.sort(countries); //Ascending order
        System.out.println("Ascending order = " + countries); // //Descending order
//        Collections.sort(countries, Collections.reverseOrder());
//        System.out.println("Descending order = " + countries);

        // Using lambda expression to sort in descending order
        countries.sort((o1, o2) -> o2.compareTo(o1)); // Corrected lambda for reverse alphabetical order
        System.out.println("Descending order = " + countries);

//        Shuffling the list
//        Collections.shuffle(countries);
//        System.out.println(countries); // (this output can change on each run)
//
//        Collections.reverse(countries);
//        System.out.println(countries);
    }
}
