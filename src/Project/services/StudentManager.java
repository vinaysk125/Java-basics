package Project.services;

//  Imported important libraries

import Project.entities.Student;
import java.util.*;

public class StudentManager {

    private HashMap <Integer, Student> studentMap = new HashMap<>();

    // Add
    public boolean addStudent(Student s) {
        if (studentMap.containsKey(s.getId())) {
            return false;
        } else {
        studentMap.put(s.getId(), s);
            return true;
        }
    }

    // View All Students
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }

    //  Update Marks
    public boolean updateMarks (int id, double marks) {
        Student s = studentMap.get(id);
        if (s == null) return false;
        s.setMarks(marks);
        return true;
    }

    // Delete Student
    public boolean deleteStudent (int id) {
        return studentMap.remove(id) != null;
    }

    // Search Student
    public Student searchStudent(int id) {
        return studentMap.get(id);
    }
}
