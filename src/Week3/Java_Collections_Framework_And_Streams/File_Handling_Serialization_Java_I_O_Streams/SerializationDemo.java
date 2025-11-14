package Week3.Java_Collections_Framework_And_Streams.File_Handling_Serialization_Java_I_O_Streams;

import java.io.*;
import java.util.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + marks + ")";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vinay", 85));
        students.add(new Student(2, "Karan", 90));

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(students);
            System.out.println("✅ Student data serialized successfully!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            List<Student> loaded = (List<Student>) ois.readObject();
            System.out.println("🔄 Deserialized student data:");
            for (Student s : loaded) System.out.println(s);
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

