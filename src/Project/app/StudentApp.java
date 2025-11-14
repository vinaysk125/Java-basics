package Project.app;

import Project.entities.Student;
import Project.services.StudentManager;
import Project.utils.FileHandler;

import java.util.Scanner;


public class StudentApp {
    public static void main() {
        // Main Steps in the Code
        StudentManager manager = new StudentManager();

        // Load existing data
        var loadData = FileHandler.loadData();
        loadData.forEach((k,v) -> manager.addStudent(v));

        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // The Menu Loop
        while (true) {
            System.out.println("\n====== Student Management ======");
            System.out.println("1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Search by ID");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                // Add Student
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    boolean added = manager.addStudent(new Student(id, name, marks));
                    System.out.println(added ? "Student Added!" : "❌ Student ID already exists!");
                }
                case 2 -> {
                    // View All
                    System.out.println("All Students:");
                    manager.getAllStudents().forEach(System.out::println);
                }
                case 3 -> {
                    // Update Marks
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    System.out.print("Enter new marks: ");
                    double marks = sc.nextDouble();
                    boolean updated = manager.updateMarks(id, marks);
                    System.out.println(updated ? "Updated!" : "❌ Student not found!");
                }
                case 4 -> {
                    // Delete Student
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    boolean deleted = manager.deleteStudent(id);
                    System.out.println(deleted ? "Deleted!" : "❌ Student not found!");
                }
                case 5 -> {
                    // Search by ID
                    System.out.print("Enter ID to search: ");
                    int id = sc.nextInt();
                    Student s = manager.searchStudent(id);
                    System.out.println(s != null ? s : "❌ Not found!");
                }
                case 6 -> {
                    // Exit
                    // Save data before exit

                    FileHandler.saveData(loadData);
                    System.out.println("Exiting... Bye Vinay!");
                    sc.close();
                    return;
                }

                default -> {
                    System.out.println("Invalid option, try again");
                }
            }
        }
    }
}
