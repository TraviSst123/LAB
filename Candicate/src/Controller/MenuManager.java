package Controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Menu;

public class MenuManager extends Menu {

    CandidateManager cm = new CandidateManager();
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public MenuManager() {
    }

    public MenuManager(String td, String[] mc) {
        super(td, mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: 
            cm.getEx();
            break;
            case 2: 
            cm.getFr();
            break;
            case 3:
            cm.getInt();
            break;
            case 4:
                String[] mchon = {"Candidate name ", "Type of candidate","exit"};
                Menu searchMenu = new Menu("=== Search ===", mchon) {
                    @Override
                    public void execute(int n) {
                        
                            switch (n) {
                                case 1:
                                    System.out.print("Enter First Name or Last Name :");
                                    String input = scanner.nextLine();
                                    System.out.println("List find by first name: ");
                                    cm.Search(p -> p.getFirstname().equals(input));
                                    System.out.println("List find by last name: ");
                                    cm.Search(p -> p.getLastname().equals(input));
                                    break;
                                case 2:
                                    System.out.print("Enter type of candidate :");
                                    String input1 = scanner.nextLine();
                                    cm.Search(p -> p.getType().contains(input1));
                                    break; 
                                case 3:
                                    System.exit(0);
                            }
                        }

                    
                };
                searchMenu.run();
          

            case 5:
                System.exit(0);
        }
    }

}
