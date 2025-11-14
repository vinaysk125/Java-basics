package Java_Collections_Framework_And_Streams.Iteration_Sorting_Comparator_And_Comparable.Comparable_AND_Comparator_with_Custom_Objects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee2 {
    int id;
    String name;
    double salary;

    Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + salary + ")";
    }
}

public class ComparableDemo1 {
    public static void main(String[] args) {
        List<Employee2> employees = new ArrayList<>();
        employees.add(new Employee2(101, "Vinay", 90000));
        employees.add(new Employee2(102, "Aman", 120000));
        employees.add(new Employee2(103, "Karan", 85000));

        // Sort by salary (descending)
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        System.out.println("Sorted by salary: " + employees);

        // Sort by name (alphabetical)
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("Sorted by name: " + employees);
    }
}

