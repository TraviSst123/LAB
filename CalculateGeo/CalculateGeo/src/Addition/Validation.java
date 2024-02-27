package Addition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    
    private Scanner scanner = new Scanner(System.in);
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
     public double getDoubleAboveZeroFromInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        double number;
        while (true) {
            System.out.print( prompt );
            try {
                number = sc.nextDouble();
                if (number > 0) {
                    return number;
                } else {
                    System.err.println("Please enter the double number > 0 ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Only enter the double number > 0 ");
                sc.next();
            }
        }
    }

      public int getIntAboveZeroFromInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print(prompt);
            try {
                number = sc.nextInt();
                if (number > 0) {
                    return number;
                } else {
                    System.err.println("Please enter the integer number > 0 ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Only enter the integer number > 0 ");
                sc.next();
            }
        }
    }
      
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
    
        public  Date getDateFromInput() {
        while (true) {
            String dateString = scanner.nextLine();
            if (!dateString.isEmpty()) {
                try {
                    Date date = dateFormat.parse(dateString);
                    return date;
                } catch (ParseException e) {
                    System.err.print("Invalid date format. Please enter again (dd/MM/yyyy):");
                }
            }
        }
    }
        
        public char getValidOperator(String prompt) {
    while (true) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        if (input.length() == 1) {
            char operator = input.charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^'|| operator == '=') {
                return operator;
            }
        }
        System.out.print("Please input (+ - * / ^ =):");
    }
}
        
        public double getValidDouble(String prompt) {
    while (true) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter again: ");
        }
    }
}
}