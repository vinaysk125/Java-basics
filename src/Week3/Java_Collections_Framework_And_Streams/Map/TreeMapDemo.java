package Week3.Java_Collections_Framework_And_Streams.Map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> cityCodes = new TreeMap<>();

        cityCodes.put(91, "India");
        cityCodes.put(1, "USA");
        cityCodes.put(44, "UK");

        System.out.println("Country Codes: " + cityCodes);
        System.out.println("First Entry: " + cityCodes.firstEntry());
        System.out.println("Last Entry: " + cityCodes.lastEntry());
    }
}
