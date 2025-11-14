package Week3.Java_Collections_Framework_And_Streams.Generics_Wrapper_Classes_AND_Autoboxing_Unboxing;


// Generic class to find min and max
class GenericMinMax1<T extends Comparable<T>> {
    private T[] array;

    // Constructor
    public GenericMinMax1(T[] array) {
        this.array = array;
    }

    // Method to find minimum
    public T findMin() {
        if (array == null || array.length == 0) return null;

        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) { // element < min
                min = element;
            }
        }
        return min;
    }

    // Method to find maximum
    public T findMax() {
        if (array == null || array.length == 0) return null;

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) { // element > max
                max = element;
            }
        }
        return max;
    }
}


public class GenericMinMaxDemo1 {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {5, 3, 9, 1, 7};
        GenericMinMax1<Integer> intMinMax = new GenericMinMax1<>(intArray);
        System.out.println("Integer Min: " + intMinMax.findMin());
        System.out.println("Integer Max: " + intMinMax.findMax());

        System.out.println();

        // Double array
        Double[] doubleArray = {2.5, 7.1, 1.3, 9.8};
        GenericMinMax1<Double> doubleMinMax = new GenericMinMax1<>(doubleArray);
        System.out.println("Double Min: " + doubleMinMax.findMin());
        System.out.println("Double Max: " + doubleMinMax.findMax());

        System.out.println();

        // String array
        String[] stringArray = {"Apple", "Orange", "Banana", "Mango"};
        GenericMinMax1<String> stringMinMax = new GenericMinMax1<>(stringArray);
        System.out.println("String Min: " + stringMinMax.findMin());
        System.out.println("String Max: " + stringMinMax.findMax());
    }
}
