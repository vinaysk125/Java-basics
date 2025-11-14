package Week3.Java_Collections_Framework_And_Streams.Iteration_Sorting_Comparator_And_Comparable.Iterators_AND_Traversal_Techniques;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Create a LinkedList<String> of cities and remove any city containing letter 'a' using an Iterator.
public class IteratorsPracticeProblem1 {
    static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>(List.of("India", "America", "Japan", "Gulf"));
        System.out.println("Original list: " + cities);

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String city = it.next(); // get current city
            if (!city.isEmpty() && city.toLowerCase().contains("a")){
                //if (!city.isEmpty() && city.toLowerCase().charAt(0) == 'a') to remove first later start with A or a
            it.remove();
        }
    }
        System.out.println("After removing cities with 'a': " + cities);

        // Advance one line Java 8 features
        // Remove any city whose first character is 'a' or 'A'
//        cities.removeIf(city ->
//                !city.isEmpty() && Character.toLowerCase(city.charAt(0)) == 'a'
//        );

}
}