package Week2.InnerClasses.StaticNestedClass;

public class OuterClass {
    static String collegeName = "ABC University";

    static class Teacher {
        String subject;

        Teacher(String subject) {
            this.subject = subject;
        }
        void showDetails() {
            System.out.println(subject + " studies at = " + collegeName);
        }
    }

public static void main (String [] args) {
    Teacher t = new Teacher("Math");
    t.showDetails();
}
}
