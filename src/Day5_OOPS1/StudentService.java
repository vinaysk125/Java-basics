package Day5_OOPS1;

// This is Encapsulation example, and it is StudentService class and main class is StudentServiceTest where main code executes and run.

class Student1 {
    private String name;
    private int rollNumber;
    private double marks;

    public Student1(String name, int rollNumber, double marks) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
        public String getName() {
            return name;
        }

        public int getrollNumber(){
            return rollNumber;
        }

        public double getMarks() {
            return marks;
        }
}

public class StudentService {

    public static double AverageMarks(Student1 s1, Student1 s2){
        return (s1.getMarks() + s2.getMarks()) / 2;
    }

    public static Student1 topper(Student1 s1, Student1 s2){
        return (s1.getMarks() > s2.getMarks()) ? s1 : s2;
    }

}
