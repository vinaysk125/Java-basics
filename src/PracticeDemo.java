import java.util.*;  // for List, ArrayList, Collections, Comparator

public class PracticeDemo {

    // Same Student class — no need to implement Comparable now
    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Create a list of Student objects
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Vinay"));
        list.add(new Student(1, "Bob"));
        list.add(new Student(2, "Charlie"));

        /**
         * Create a Comparator that compares Students by their names (alphabetically).
         * Comparator is a functional interface, so we can use a lambda expression.
         *
         * compare() returns:
         *  - negative number if s1.name < s2.name
         *  - zero if s1.name == s2.name
         *  - positive number if s1.name > s2.name
         */
        Comparator<Student> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);

        // Sort the list using our custom comparator
        Collections.sort(list, nameComparator);

        // Print the sorted list
        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
