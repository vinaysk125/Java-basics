package Project.entities;
//  Mini Project – Student Management System (CRUD + Collections + File I/O + Exceptions)

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {

//  Student Fields (Attributes)
    public int id;
    private String name;
    private double marks;

//    Constructor (How a Student is Created)
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

//    Getters – to read data

    public int getId() { return id; }
    public String getName() { return name; }
    public Double getMarks() { return marks; }

//    Setters – to update data

    public void setName(String name) { this.name = name; }
    public void setMarks(double marks) { this.marks = marks; }

//    toString() – How the Student Looks When Printed
    @Override
    public String toString() {
        return id + " | " + name + " | " + marks;

    }

//    compareTo() – How Students Are Compared
//    This tells Java:
//    👉 Compare students using their marks
//    So sorting will arrange them from lower marks → higher marks
    @Override
    public int compareTo(Student s) {
        return Double.compare(this.marks, s.marks); // sort by marks
}

}

