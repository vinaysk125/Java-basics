package Java_Collections_Framework_And_Streams.Generics_Wrapper_Classes_AND_Autoboxing_Unboxing;


// Generic class to find min and max
class GenericMinMax<T extends Comparable<T>> {
    private T[] array;

    // Constructor
    public GenericMinMax(T[] array) {
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


public class GenericMinMaxDemo {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {5, 3, 9, 1, 7};
        GenericMinMax<Integer> intMinMax = new GenericMinMax<>(intArray);
        System.out.println("Integer Min: " + intMinMax.findMin());
        System.out.println("Integer Max: " + intMinMax.findMax());

        System.out.println();

        // Double array
        Double[] doubleArray = {2.5, 7.1, 1.3, 9.8};
        GenericMinMax<Double> doubleMinMax = new GenericMinMax<>(doubleArray);
        System.out.println("Double Min: " + doubleMinMax.findMin());
        System.out.println("Double Max: " + doubleMinMax.findMax());

        System.out.println();

        // String array
        String[] stringArray = {"Apple", "Orange", "Banana", "Mango"};
        GenericMinMax<String> stringMinMax = new GenericMinMax<>(stringArray);
        System.out.println("String Min: " + stringMinMax.findMin());
        System.out.println("String Max: " + stringMinMax.findMax());
    }
}
