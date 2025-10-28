package Week1.AccessModifiers.Test;

import Week1.AccessModifiers.School.Student;

public class test {
    public static void main(String [] args){
        Student student = new Student();
        student.name = "vinay";
        student.age = 24;
        student.display();
    }
}
