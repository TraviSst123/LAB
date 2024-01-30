package View;


import Controller.BMICalculator;
import Controller.Calculator;
import java.util.Scanner;
import View.Menu;



public class MainMenu extends Menu {

    Scanner sc = new Scanner(System.in);
    Calculator c = new Calculator();
    BMICalculator bmi = new BMICalculator();

    public MainMenu() {
    }

    public MainMenu(String td, String[] mc) {
        super(td, mc);
    }

    @Override
    public void execute(int n) {
         switch (n) {
             case 1:
                 c.GetInput();
                 c.ContinueCaculate();
                 c.ShowFinalResult();
                 break;
             case 2:
                 bmi.getBMI();;
                 bmi.CalculateBMI();
                 break;
             case 3:
                 System.exit(0);
         }
    }
}