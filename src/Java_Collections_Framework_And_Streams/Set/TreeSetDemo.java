package Java_Collections_Framework_And_Streams.Set;


import java.util.TreeSet;

public class TreeSetDemo {
    static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(20);
        System.out.println(treeSet); // By default sorted.

        System.out.println("Highest: " + treeSet.last());
        System.out.println("Lowest: " + treeSet.first());

        // New TreeSet
        TreeSet<String> treeSetString = new TreeSet<>();
        treeSetString.add("Vicky");
        treeSetString.add("Baban");
        treeSetString.add("Gopi");
        System.out.println(treeSetString);
        System.out.println(treeSetString.isEmpty());
        System.out.println(treeSetString.size());
        treeSetString.clear();
        System.out.println(treeSetString);

    }
}
