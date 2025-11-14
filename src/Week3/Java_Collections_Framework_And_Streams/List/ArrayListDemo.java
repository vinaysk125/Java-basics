package Week3.Java_Collections_Framework_And_Streams.List;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       //  List<Integer> list1 = new ArrayList<>();
      //  ArrayList<Integer> list = new ArrayList<11>(); 11 is just initial capacity
        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10); // duplicates allowed

        // Display
        System.out.println("Size of : " +list.size());
        System.out.println(list);

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Traversal
        System.out.println("Using for-each loop:");
        System.out.println();
        for (int n: list) {
            System.out.println(n);
        }

        // Contain
        System.out.println("Is " + 10 + " number contain in a list : " +list.contains(10));

        // Access & modify
        System.out.println("Get number from list : " + list.get(0)); // Access
        System.out.println("Set number in the list : " + list.set(3,40)); // Set
        System.out.println("After Set: " + list);

        // Remove
        System.out.println(list.remove(0)); // remove only index not value
        System.out.println(Integer.valueOf(20)); // Remove value as object
        System.out.println("After Remove: " + list);

        // sort list
        list.sort(null); // Ascending order, Comparator concepts
        // Collections.sort(list);
        System.out.println("After ascending sorting: " + list);
        list.sort((a, b) -> b - a); // Ascending order, Comparator concepts Lymda expression
        System.out.println("After Descending sorting: " + list);

    }
}
