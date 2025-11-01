package Week2.InnerClasses.RegularNonStaticInnerClass;

public class OuterClass {
    private String collegeName = "ABC University";
    // inner class

    public class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public void showDetails () {
            System.out.println(name + " studies at = " + collegeName);
        }
    }

public static void main(String[] args) {
            OuterClass outer = new OuterClass(); // Create outer class object
            OuterClass.Student student = outer.new Student("Alice"); // Create inner class object
            student.showDetails();
        }
}
