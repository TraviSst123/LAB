package Model.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    public static String readInputFile(String filePath) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new IOException("Error reading input file: " + e.getMessage());
        }
        return stringBuilder.toString();
    }
}