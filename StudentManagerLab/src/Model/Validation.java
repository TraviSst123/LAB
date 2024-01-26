package Model;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    
    private Scanner scanner = new Scanner(System.in);
    

    public int getValidInteger(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
    

    public String getValidEmail(String prompt) {
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (pattern.matcher(input).matches()) {
                return input;
            } else {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
    

    public String getNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input != null && !input.trim().isEmpty()) {
                return input;
            } else {
                System.out.println("Chuỗi không được để trống. Vui lòng nhập lại.");
            }
        }
    }
    
    public String get123(String prompt) {
    while (true) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        try {
            int value = Integer.parseInt(input);
            if (value == 1 ) {
                return "Java";
            } if (value == 2 ) {
                return ".Net";
            } 
            else {if (value == 3 ) {
                return "C/C++";}
            
            else {
                System.out.println("Invalid value. Please enter again.");
            }}
        } catch (NumberFormatException e) {
            System.out.println("Invalid value. Please enter again.");
        }
    }
}
}