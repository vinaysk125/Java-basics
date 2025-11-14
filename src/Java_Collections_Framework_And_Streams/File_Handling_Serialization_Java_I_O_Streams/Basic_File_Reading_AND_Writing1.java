package Java_Collections_Framework_And_Streams.File_Handling_Serialization_Java_I_O_Streams;

import java.io.*;

public class Basic_File_Reading_AND_Writing1 {
    public static void main(String[] args) {

        File file = new File("data.txt");

        if (file.exists()) {
            System.out.println("File found!");
        } else {
            System.out.println("File not found!");
        }

        try {
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Hello \n");
            writer.write("This file is created using Java FileWriter.\n");
            writer.write("Learning File I/O step by step.");
            writer.close();
            System.out.println("✅ Data written to notes.txt successfully!");
        }
         catch (IOException e) {
             System.out.println("Error: " + e.getMessage());

         }
        finally {
            System.out.println("Execution completed!");
        }
    }
}
