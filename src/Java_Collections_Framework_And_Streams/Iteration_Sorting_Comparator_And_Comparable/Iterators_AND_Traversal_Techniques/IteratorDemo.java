package Java_Collections_Framework_And_Streams.Iteration_Sorting_Comparator_And_Comparable.Iterators_AND_Traversal_Techniques;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Vinay");
        names.add("Karan");
        names.add("Rohit");
        System.out.println(names);

        // Normal for-each loop
        for (String num : names) {
            System.out.println("Name: " + num);
        }

        // Using Iterator
        Iterator<String> it = names.iterator();
        System.out.println("\nUsing Iterator:");
        while (it.hasNext()) {
            String current = it.next();
            if (current.equals("Karan")) {
                it.remove();
            }
        }
        System.out.println(it); // Output = java.util.ArrayList$Itr@27716f4 (It making changes on names itself)
        System.out.println("After removal = " + names);
    }
}
