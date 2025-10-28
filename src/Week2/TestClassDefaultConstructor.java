package Week2;

public class TestClassDefaultConstructor {
    static class Student{
        String name;
        int age;

        // Default constructor
        Student() {
          name = "Unknown";
          age = 24;
        }

        // Parameterized constructor
        Student(String studentName, int student_Age){
            this.name = studentName;
            this.age = student_Age;
        }

        // Copy constructor
        Student(Student newStudent){
            this.name = newStudent.name;
            this.age = newStudent.age;
        }

        void display() {
            System.out.println("Name of student = " + name + " age = " + age);
        }
    }
public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Parameterized Name", 21);
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();
}
}
