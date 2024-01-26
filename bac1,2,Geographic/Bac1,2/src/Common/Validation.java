
package Common;

import java.util.Scanner;


public class Validation {
    protected Scanner sc = new Scanner(System.in);

 

    public double validateDouble() {
   
        double inputDouble;

        while (true) {
            try {
                inputDouble = Double.parseDouble(sc.nextLine());
                return inputDouble;
            } catch (NumberFormatException e) {
                System.out.println("Please input Double number!!!");
                System.out.print("Enter Double number: ");
            }
        }
    }

    public boolean isOdd(double inputNumber) {
        return inputNumber % 2 != 0;
    }

    public boolean isEven(double inputNumber) {
        return inputNumber % 2 == 0;
    }

    public boolean isSquare(double inputNumber) {
        if (inputNumber == 0) {
        } else {
            return ((int) Math.sqrt(inputNumber) * (int) Math.sqrt(inputNumber) == inputNumber);
        }
        return false;
    }
}
