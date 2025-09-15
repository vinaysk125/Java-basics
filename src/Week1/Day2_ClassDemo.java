package Week1;

public class Day2_ClassDemo {

    public static void main(String[] args){
    Student s1 = new Student(); // 1's instance(object) of class Student - default constructor so no parameter to pass
    s1.displayDetails();
    System.out.println(s1.name + " grade is  = " + s1.calculateGrade());

    Student s2 = new Student(2, "Chagan", 94.20);  // 2's instance(object) of class Student - parameterized constructor so parameter passed
    s2.displayDetails();
    s2.updateMarks(95.2);
    System.out.println(s2.name + " grade is = " + s2.calculateGrade());

    Student s3 = new Student(3, "Magan", 92.20);
    s3.displayDetails();
    s3.updateMarks(93);
    System.out.println("Update marks of " + s2.name + " is = " + s3.marks);
    }
}
