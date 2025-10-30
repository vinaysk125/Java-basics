package Week2;

class Shape {
    void shape() {
        System.out.println("This is Shape parent class and shape method");
    }
    void area() {
        System.out.println("This is Shape parent class and area method");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("This is Circle child class and area method");
    }
}
class Rectangle extends Shape {
    void area() {
        System.out.println("This is Rectangle child class and area method");
    }
}
class Triangle extends Shape {
    void area() {
        System.out.println("This is Triangle child class and area method");
    }
}

public class Inheritance2{
    public static void main(String [] args) {
        Shape s = new Shape(); s.area();
        Circle c = new Circle(); c.area();
        Rectangle r = new Rectangle(); r.area();
        Triangle T = new Triangle(); T.area();
    }
}