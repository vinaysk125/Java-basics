package Week3.Java_Collections_Framework_And_Streams.File_Handling_Serialization_Java_I_O_Streams;

import java.io.*;

public class Reading_from_a_File {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("Notes.txt");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
            reader.close();

        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {
            System.out.println("\nExecution completed!");
        }
    }
}
