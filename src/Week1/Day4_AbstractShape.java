package Week1;

abstract class Day4_AbstractShape {

    // Abstract Method
    abstract double calculateArea();

    // Concreate Method
    public void displayArea() {
        System.out.println("Here is Area!");
    }
}
class Circle extends Day4_AbstractShape {

        double radius;

        Circle (double r) {
            this.radius = r;
        }

        double calculateArea(){
            return 3.14*radius*radius;
    }
}
class Rectangle extends Day4_AbstractShape{
        double length, width;

        Rectangle (double length, double width){
            this.length = length;
            this.width = width;
        }

        double calculateArea(){
            return length*width;
        }
}

