package Java_Collections_Framework_And_Streams.List;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.addFirst(5);
        numbers.addLast(50);
        System.out.println(numbers.size());

        System.out.println("Numbers = " + numbers);

        numbers.remove();
        System.out.println("Remove numbers = " + numbers);

        numbers.removeFirst(); // O(1)
        System.out.println("Remove First numbers = " + numbers);

        numbers.removeLast();   // O(1)
        System.out.println("Remove last numbers = " + numbers);
        System.out.println("Get element in index = " + numbers.get(1)); // O(n)
        // Traversing
        System.out.println("Traverse in Linked list using for each loop");
        for (int num : numbers)
            System.out.println("Value: " + num);

    }
}
