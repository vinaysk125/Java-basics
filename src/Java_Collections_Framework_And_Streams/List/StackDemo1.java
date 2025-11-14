package Java_Collections_Framework_And_Streams.List;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
//      Integer peek = stack.peek();
//      System.out.println(peek);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        // Search index start with 1
        // [1, 2, 3, 4] but index start from upper lower means right to left not vice versa as it is stack
        int search = stack.search(2);
        System.out.println(search);
    }
}
