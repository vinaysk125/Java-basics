package Week2;

public class TestClass {
    static class Car {
        String brand;
        String model;
        int price;

        void displayCar() {
            System.out.println("This is " + brand + " car class method");
            System.out.println("Car Details:");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.model = "Petrol";
        c1.price = 1000000;

        c1.displayCar();
        System.out.print("\n");
        Car c2 = new Car();
        c1.brand = "Porch";
        c1.model = "Petrol";
        c1.price = 10000000;

        c1.displayCar();
    }
}