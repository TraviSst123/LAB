package Model.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public static void writeOutputFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            throw new IOException("Error writing output file: " + e.getMessage());
        }
    }
}