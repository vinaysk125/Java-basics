package Java_Collections_Framework_And_Streams.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Vinay");
        map.put(2, "Binod");
        map.put(3, "Sinod");
        System.out.println(map);

        String student = map.get(1);
        System.out.println(student);
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Vinay"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        // for loop
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
            for (Map.Entry<Integer, String> entry: entries) {
                System.out.println(entry.getKey() + ": " + entry.getValue().toUpperCase());
            }
        map.remove(3);
        map.remove(2, "Binod");
        System.out.println(map);
    }

}

