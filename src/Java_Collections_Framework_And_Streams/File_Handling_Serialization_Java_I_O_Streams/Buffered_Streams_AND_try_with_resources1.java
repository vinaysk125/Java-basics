package Java_Collections_Framework_And_Streams.File_Handling_Serialization_Java_I_O_Streams;

import java.io.*;
        //  Using BufferedReader and BufferedWriter

public class Buffered_Streams_AND_try_with_resources1 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt"));
            bw.write("Vinay, 99");
            bw.newLine();
            bw.write("Karan,90");
            bw.newLine();
            bw.write("Rohit,75");
            bw.newLine();
            System.out.println("✅ Data written to students.txt");
            bw.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed for BufferWriter!");
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("Student.txt"));
            String line;
            System.out.println("Reading students.txt:");
            while ((line = br.readLine()) != null){
                System.out.println("-> " + line);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed for BufferReader!");
        }
    }
}
