package Model;

import java.util.Scanner;

public class Validation {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static boolean getYN(String message) {
        System.out.print(message + " (Y/N): ");
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("y");
    }
    
}