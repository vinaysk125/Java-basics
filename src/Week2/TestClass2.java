package Week2;

public class TestClass2 {
    static class Rectangle {
        float length;
        float breadth;

        void setDimensions(float l, float b){
            length = l;
            breadth = b;
        }

        float calculateArea() {
            return length*breadth;
        }

        float calculatePerimeter() {
            return 2*(length+breadth);
        }
    }
public static void main(String[] args){

        Rectangle r1 = new Rectangle();
        r1.setDimensions(2.1f,3.1f);
        System.out.println("Area of rectangle = " + r1.calculateArea());
        System.out.println("Parameter of rectangle = " + r1.calculatePerimeter());
    }
}
