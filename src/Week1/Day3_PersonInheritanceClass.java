package Week1;

class Day3_PersonInheritanceClass {
    String name;
    int age;

    public void displayInfo1(){
        System.out.println("Name = " + name + " Age = " + age);
    }
}
class StudentInheritance extends Day3_PersonInheritanceClass {
    String course;

    public void displayInfo2() {
        System.out.println(name + " is studying " + course);
    }
}
class TeacherInheritance extends Day3_PersonInheritanceClass {
        String subject;

        public void displayInfo3(){
            System.out.println(name + " Teaches " + subject);
        }
}