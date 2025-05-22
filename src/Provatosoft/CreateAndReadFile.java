package Provatosoft;

import java.io.*;

public class CreateAndReadFile {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Step 1: Create and write to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a test file.\n");
            writer.write("We are writing and reading in the same program.\n");
            System.out.println("✅ File created and written successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }

        // Step 2: Read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\n📄 Contents of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading from file: " + e.getMessage());
        }
    }
}
