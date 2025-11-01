package Week2.InnerClasses.Local_Inner_Class_inside_method;

public class OuterClass {

    void createStudent(String name) {
        // Local inner class (inside method)
        class Student {
            void show() {
                System.out.println(name + " is a local inner class student.");
            }
        }

        Student s = new Student();
        s.show();
    }

public static void main (String[] args) {
        OuterClass o = new OuterClass();
        o.createStudent("Alice");
}
}
