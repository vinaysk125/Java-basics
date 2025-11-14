package Java_Collections_Framework_And_Streams.Iteration_Sorting_Comparator_And_Comparable.Comparable_AND_Comparator_with_Custom_Objects;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

class Employee3 {
    int id;
    String name;
    double salary;

    Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + salary + ")";
    }
}

public class ComparatorDemo1 {
    public static void main(String[] args) {
        List<Employee3> employees = new ArrayList<>();
        employees.add(new Employee3(101, "Vinay", 90000));
        employees.add(new Employee3(102, "Aman", 120000));
        employees.add(new Employee3(103, "Karan", 85000));

        // Sort by salary (descending)
        employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        System.out.println("Sorted by salary: " + employees);

        // Sort by name (alphabetical)
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("Sorted by name: " + employees);
    }
}
