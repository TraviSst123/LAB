
import Controller.MenuManagement;

public class Main {
    public static void main(String[] args) {
        String[] mchon = {"Create","Find and Sort","Update/Delete","Report","Exit"};
        MenuManagement MenuManager = new MenuManagement("=== WELCOME TO STUDENT MANAGEMENT ===", mchon);
        MenuManager.run();
        
    }
}