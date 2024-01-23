package Controller;

import Model.input.Input;
import Model.output.Output;
import View.Menu;

import java.io.IOException;

public class NormalizedSystem extends Menu {
    public NormalizedSystem() {
        super();
    }

    @Override
    public void run() {
        System.out.println("Welcome to Text Normalizer!");
        System.out.print("Enter the path of the input file: ");
        String inputFilePath = scanner.nextLine();
        System.out.print("Enter the path of the output file: ");
        String outputFilePath = scanner.nextLine();

        try {
            String text = Input.readInputFile(inputFilePath);
            String normalizedText = TextNormalizer.normalizeText(text);
            Output.writeOutputFile(outputFilePath, normalizedText);
            System.out.println("Text normalization completed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}