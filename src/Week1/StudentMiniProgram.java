package Week1;

public class StudentMiniProgram {

    public static void main(String [] args){
        StudentProgram s1 = new StudentProgram();
        s1.displayStudentDetails();
        System.out.println("Grade got " + s1.studentName + " is = " + s1.studentgrade());

        StudentProgram s2 = new StudentProgram(2, "Chagan", 94.2);
        s2.displayStudentDetails();
        System.out.println("Grade got " + s2.studentName + " is = " + s2.studentgrade());

        StudentProgram s3 = new StudentProgram(3, "Magan", 89.2);
        s3.displayStudentDetails();
        System.out.println("Grade got " + s3.studentName + " is = " + s3.studentgrade());
    }
}
