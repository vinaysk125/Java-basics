package Week1;

public class Day3_PersonInheritanceClassMain {
    public static void main(String[] args) {
        Day3_PersonInheritanceClass p = new Day3_PersonInheritanceClass();
        p.name = "Vinay";
        p.age = 24;
        p.displayInfo1();

        StudentInheritance s = new StudentInheritance();
        s.name ="Vinay";
        s.course ="Java";
        s.age = 21;
        s.displayInfo2();

        TeacherInheritance t = new TeacherInheritance();
        t.name = "Vinay";
        t.subject = "Spring Boot";
        t.displayInfo3();
    }
}