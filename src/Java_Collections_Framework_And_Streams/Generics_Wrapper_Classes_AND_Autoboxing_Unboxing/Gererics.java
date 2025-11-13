package Java_Collections_Framework_And_Streams.Generics_Wrapper_Classes_AND_Autoboxing_Unboxing;

import java.util.ArrayList;

//  Without Generics:

public class Gererics {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(10); // allowed (but risky)

        String s = (String) list.get(0); // need to cast



//    With Generics:

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("One");
//        list1.add(10); compile-time error

        String sb = list1.get(0);
    }
}
