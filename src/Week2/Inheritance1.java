package Week2;

class Vehicle {
    //Parent/Derived/Superclass class
    String brand = "BMW";
    String model = "SUV";

    //   Inheritance1_Vehicle(String b, String m) {
//        this.brand = b;
//        this.model = m;
//
//    }
    void displayInfo() {
        System.out.println("Vehicle brand name is = " + brand);
        System.out.println("Vehicle Model name is = " + model);
    }

}
    class Car extends Vehicle {

        void displayCarClass() {
        System.out.println("This is car class.");
    }
    }

public class Inheritance1 {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.displayInfo();
        Car obj2 = new Car();
        obj2.displayCarClass();
    }
}