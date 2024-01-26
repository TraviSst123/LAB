package Controller;



import java.util.Scanner;
import view.Menu;

public class MenuManagement extends Menu {
    StudentManagement sm = new StudentManagement();
    Scanner sc = new Scanner(System.in);
    public MenuManagement() {
    }

    public MenuManagement(String td, String[] mc) {
        super(td, mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: 
                sm.getS();
                break;
            case 2: 
                System.out.print("Enter 1 to Search and 2 to Sort: ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        sm.searchS();
                        break;
                    case 2:
                        sm.SortByStudentName();
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            break;
            case 3:
                     System.out.println("Enter 1 to Update and 2 to Delete: ");
                int choice1 = sc.nextInt();
                switch (choice1){
                    case 1:
                        System.out.println("Enter ID: ");
                        String id =sc.nextLine();
                        sc.nextLine();
                        sm.updateById(id);     
                        break;
                    case 2:
                        System.out.println("Enter ID: ");
                        id =sc.nextLine();
                        sc.nextLine();
                        sm.deleteById(id);     
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            break;
            case 4:
                sm.displayAllStudents();
                break;
            case 5:
                System.exit(0);
        }
    }

}
