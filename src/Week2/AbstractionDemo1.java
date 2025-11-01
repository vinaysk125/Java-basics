package Week2;

abstract class Vehicle1 {
    String brand;

    Vehicle1(String b) {
        this.brand = b;
    }
    abstract void start();

    void stop() {
        System.out.println(brand + " Vehicle stopped!!");
    }
}

class Car1 extends Vehicle1 {

    Car1(String brand) {
        super(brand);
    }
    void start() {
        System.out.println(brand + " Car start with key ignition");
    }
}

class Electric extends Vehicle1 {

    Electric(String brand) {
        super(brand);
    }
    void start() {
        System.out.println(brand + " Electric vehicle start silently");
    }
}

public class AbstractionDemo1 {
    public static void main(String [] args) {
    Car1 c = new Car1("BMW");
    c.start();
    c.stop();
    Electric e = new Electric("OLA");
    e.start();
    e.stop();
}
}
