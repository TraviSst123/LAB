package Controller;

import Model.Dictionary;
import View.Menu;

import java.io.IOException;
import java.util.Scanner;

public class DictionaryCTRL extends Menu {
    private Dictionary dictionary;
    private Scanner scanner;

    public DictionaryCTRL() {
        super("Dictionary Menu", new String[]{"Add Word", "Remove Word", "Translate", "Save", "Load", "Exit"});
        this.dictionary = new Dictionary();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void execute(int n) {
        try {
            switch (n) {
                case 1:
                    addWord();
                    break;
                case 2:
                    removeWord();
                    break;
                case 3:
                    translate();
                    break;
                case 4:
                    save();
                    break;
                case 5:
                    load();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid selection.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private void addWord() throws IOException {
        System.out.print("Enter English word: ");
        String english = scanner.nextLine();
        System.out.print("Enter Vietnamese translation: ");
        String vietnamese = scanner.nextLine();
        dictionary.addWord(english, vietnamese);
    }

    private void removeWord() throws IOException {
        System.out.print("Enter English word to remove: ");
        String english = scanner.nextLine();
        dictionary.removeWord(english);
    }

    private void translate() {
        System.out.print("Enter English word to translate: ");
        String english = scanner.nextLine();
        String translation = dictionary.translate(english);
        System.out.println("Translation: " + translation);
    }

    private void save() throws IOException {
        dictionary.saveData();
        System.out.println("Dictionary saved.");
    }

    private void load() throws IOException {
        dictionary.loadData();
        System.out.println("Dictionary loaded.");
    }
}