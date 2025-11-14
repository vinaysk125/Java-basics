package Week3.Java_Collections_Framework_And_Streams.Set;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetDemo {
    static void main(String[] args) {
        HashSet<String> hasset = new HashSet<>();
        hasset.add("India");
        hasset.add("USA");
        hasset.add("Japan");
        hasset.add("India"); // duplicate ignored
        System.out.println(hasset);
        System.out.println(hasset.contains("USA"));

        System.out.println(hasset.remove("Japan"));
        System.out.println(hasset);
    }
}
