
import Controller.MenuManager;

public class Main {
    public static void main(String[] args) {
        String[] mchon = {"Experience","Fresher","Internship","Search","Exit"};
        MenuManager MenuManager = new MenuManager("=== Menu ===", mchon);
        MenuManager.run();
        
    }
}