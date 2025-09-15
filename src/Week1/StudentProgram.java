package Week1;

public class StudentProgram {
    // // Fields (attributes)
    int studentRollNo;
    String studentName;
    double studentMarks;

    // Default constructor
    StudentProgram(){
        studentRollNo = 1;
        studentName = "Vinay";
        studentMarks = 98.20;
    }

    // Parameterized constructor
    StudentProgram(int rollNo, String name, double marks){
        studentRollNo = rollNo;
        studentName = name;
        studentMarks = marks;
    }

    public void displayStudentDetails(){
        System.out.println("Student name = " + studentName + " RollNumber = " + studentRollNo + " Marks = " + studentMarks);
    }

    public String studentgrade(){
        if (studentMarks >= 95) return "A";
        else if (studentMarks >= 90) return "B";
        else if (studentMarks >=85) return "C";
        else return "False";
    }
}
