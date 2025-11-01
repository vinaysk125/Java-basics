package Week2;

public class Encapsulation1 {
    class Student {
        private String name;
        private int rollNumber;
        private double marks;

        public String getName() {
            return name;
        }
        public int getRollNumber() {
            return rollNumber;
        }
        public double getMarks() {
            return marks;
        }

        public void setName(String n) {
            this.name = n;
        }
        public void setRollNumber(int rn) {
            this.rollNumber = rn;
        }
        public void setMarks(double m) {
            this.marks = m;
        }
    }
public static void main(String[] args){
        Encapsulation1 outer = new Encapsulation1();
        Encapsulation1.Student s1 = outer.new Student();
        s1.setName("Sham");
        System.out.println("Name is = " + s1.getName());
        s1.setRollNumber(21);
        System.out.println("Roll Number is = " + s1.getRollNumber());
        s1.setMarks(100.00);
        System.out.println("Marks is = " + s1.getMarks());
}
}
