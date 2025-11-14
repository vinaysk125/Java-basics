package Project.utils;

import Project.entities.Student;

import java.io.*;
import java.util.*;

public class FileHandler {
    // The FILE_NAME
    private static final String FILE_NAME = "students.dat";

    // Saving Data
    public static void saveData(HashMap<Integer, Student> map) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(map);
            System.out.println("💾 Data saved successfully in students.dat!");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    // Loading Data
    public static HashMap<Integer, Student> loadData() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new HashMap<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (HashMap<Integer, Student>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error loading data: " + e.getMessage());
            return new HashMap<>();
        }
    }
}
