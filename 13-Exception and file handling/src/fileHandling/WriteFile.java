package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try (FileWriter writer = new FileWriter(fileName);){
//            FileWriter writer = new FileWriter(fileName);
            writer.write("this is the best java course");
            for (int i = 0; i < 10000; i++) {
                writer.write('*');
            }
            writer.flush();
            System.out.println("File written successfully");

        } catch (IOException exception) {
            System.out.printf("Exception occurred: %s\n", exception.getMessage());
        }
    }
}
