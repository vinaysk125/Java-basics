package Week1;

public class Student {
        // Fields (attributes)
        int studentID;
        String name;
        double marks;
        // Default constructor
        Student(){
            studentID = 1;
            name = "Vinay";
            marks = 96.20;
        }
        // Parameterized constructor
        Student(int id, String n, double m){ // Overloaded constructor as same name Student but different parameter
            studentID = id;
            name = n;
            marks = m;
        }
        // Method void return type and no parameter passed
        public void displayDetails(){
            System.out.println("Student Id = " + studentID + " Name is = " + name + " and marks is = " + marks);
        }
        // Method String return type and parameter passed
        // Method to calculate grade
        public String calculateGrade(){
            if (marks >= 95) return "A";
            else if (marks >= 90) return "B";
            else return "Fail";
        }
        // Method void return type and parameter passed
        // Method to update marks
        public void updateMarks(double newMarks){
            marks = newMarks;
        }
        // Overloaded method as same name updateMarks but different parameter
        public void updateMarks(int newMarks){
            marks = newMarks;
        }
    }

