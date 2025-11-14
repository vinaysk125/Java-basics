package Week3.Java_Collections_Framework_And_Streams.List;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Milk");
        list.add("Egg");
        list.add("Jam");
        System.out.println("Inital list = " + list);

        for (String str : list) {
            System.out.println(str);
            if (str.equals("Egg")) {
                list.add(list.indexOf("Egg") + 1,"Butter");
                System.out.println("Butter added Egg found in list");
            }
        }
        System.out.println("Modified list = " + list);
    }
}
