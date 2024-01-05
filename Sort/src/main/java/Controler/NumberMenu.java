package Controler;
import java.util.Scanner;
import Model.Sort;
import Model.Search;
import View.Menu;

public class NumberMenu extends Menu {
    private float[] numbers;

    public NumberMenu() {
        super("Number Menu", new String[]{"Enter numbers", "Sort numbers", "Search"});
        numbers = null;
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                enterNumbers();
                break;
            case 2:
                sortNumbers();
                break;
            case 3:
                searchNumbers();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    private void enterNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        numbers = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextFloat();
        }
    }

    private void sortNumbers() {
        if (numbers == null) {
            System.out.println("Please enter numbers first.");
            return;
        }
        System.out.println("Sorting numbers...");
        Sort.bubbleSort(numbers);
        System.out.println("Numbers sorted successfully.");
    }

    private void searchNumbers() {
        if (numbers == null) {
            System.out.println("Please enter numbers first.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        float target = sc.nextFloat();
        Search search = new Search();
        System.out.println("Searching number...");
        search.Linearsearch(numbers, target);
    }
}