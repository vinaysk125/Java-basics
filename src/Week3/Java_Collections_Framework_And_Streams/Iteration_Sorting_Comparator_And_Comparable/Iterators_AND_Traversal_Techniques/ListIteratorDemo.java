package Week3.Java_Collections_Framework_And_Streams.Iteration_Sorting_Comparator_And_Comparable.Iterators_AND_Traversal_Techniques;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10,20,30,40));

        ListIterator<Integer> listIt = numbers.listIterator();

        System.out.println("Forward Traversal:");
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("Backward Traversal:");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
    }
}