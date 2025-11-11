import java.util.*;  // for List, ArrayList, Collections, Comparator

public class PracticeDemo {
    static void main(String[] args) {

        try {
            int result = 10 / 5;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Execution completed");
        }
    }
}