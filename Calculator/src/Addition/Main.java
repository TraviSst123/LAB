
package Addition;


import View.MainMenu;

public class Main {
    public static void main(String[] args) {
        String[] mchon = {"Normal Calculator","BMI Calculator","Exit"};
        MainMenu MenuManager = new MainMenu("=== Calculator Program ===", mchon);
        MenuManager.run();
        
    }
}
    

