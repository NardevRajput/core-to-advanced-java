package Questions.Question89;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = input.next();
        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException exception) {
            System.out.printf("%s Not found", fileName);
        }

        catch (IOException e) {
            System.out.printf("Exception occured: %s", e.getMessage());
        }
    }
}
