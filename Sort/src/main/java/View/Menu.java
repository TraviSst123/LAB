package View;

import java.util.Scanner;

public abstract class Menu {
    private String title;
    private String[] options;

    public Menu(String title, String[] options) {
        this.title = title;
        this.options = options;
    }

    public abstract void execute(int choice);

    public void display() {
        System.out.println("----- " + title + " -----");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.println("-----------------------");
    }

    public int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
}