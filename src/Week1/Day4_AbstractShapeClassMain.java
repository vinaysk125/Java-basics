package Week1;

public class Day4_AbstractShapeClassMain {
    public static void main(String [] args){
        Circle c = new Circle(12.5);
        c.displayArea();
        System.out.println("Area of circle is = " + c.calculateArea());


        Rectangle r = new Rectangle(1.2,3.4);
        System.out.println("Area if Rectangle = " + r.calculateArea());

    }
}
