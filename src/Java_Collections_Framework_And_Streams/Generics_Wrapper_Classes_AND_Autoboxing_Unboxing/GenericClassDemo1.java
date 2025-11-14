package Java_Collections_Framework_And_Streams.Generics_Wrapper_Classes_AND_Autoboxing_Unboxing;

import java.security.PrivateKey;

// Simple generic class

class Box1<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

//  Create a Pair<K,V> generic class with key and value

class PairClass1<K, V> {
    private K key;      // Int
    private V value;    // String

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class GenericClassDemo1 {
    public static void main(String[] args) {
        Box1<Integer> b = new Box1<>();
        b.setValue(10);
        System.out.println("Integer value: " + b.getValue());

        Box1<String> b1 = new Box1<>();
        b1.setValue("Vinay");
        System.out.println("String value: " + b1.getValue());

        //  Create a Pair<K,V> generic class with key and value

        PairClass1<Integer, String> p = new PairClass1<>();
        p.setKey(1);
        p.setValue("Vinay");

        System.out.println(p.getValue() + " : " + p.getKey());

    }
}
