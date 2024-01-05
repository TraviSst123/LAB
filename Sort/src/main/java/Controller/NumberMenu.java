package Controller;

import java.util.Scanner;
import View.Menu;
import Model.Library;

public class NumberMenu extends Menu {
    private Library library;
    private Scanner scanner;

    public NumberMenu() {
        super("Number Menu", new String[]{"Enter numbers", "Sort numbers", "Search"});
        library = new Library();
        scanner = new Scanner(System.in);
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
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        float[] numbers = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            if (scanner.hasNextFloat()) {
                numbers[i] = scanner.nextFloat();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Đọc dòng thừa để tiếp tục vòng lặp
                i--; // Lặp lại lần nhập hiện tại
            }
        }
        library.setNumbers(numbers);
        System.out.println("Numbers entered successfully.");
    }

    private void sortNumbers() {
    float[] numbers = library.getNumbers();
    if (numbers == null) {
        System.out.println("Please enter numbers first.");
        return;
    }

    System.out.println("Choose the sorting algorithm:");
    System.out.println("1. Bubble Sort");
    System.out.println("2. Quick Sort");
    System.out.print("Enter your choice: ");
    int sortingChoice = scanner.nextInt();

    System.out.println("Sorting numbers...");
    switch (sortingChoice) {
        case 1:
            Algorithm.Sort.bubbleSort(numbers);
            System.out.println("Numbers sorted using Bubble Sort.");
            break;
        case 2:
            Algorithm.Sort.quickSort(numbers, 0, numbers.length - 1);
            System.out.println("Numbers sorted using Quick Sort.");
            break;
        default:
            System.out.println("Invalid choice. Sorting canceled.");
            return;
    }

    System.out.println("Sorted numbers:");
    for (float number : numbers) {
        System.out.print(number + " ");
    }
    System.out.println();
}

   private void searchNumbers() {
    float[] numbers = library.getNumbers();
    if (numbers == null) {
        System.out.println("Please enter numbers first.");
        return;
    }
    
    System.out.print("Enter the number you want to search for: ");
    float key = scanner.nextFloat();
    
    System.out.println("Choose the search algorithm:");
    System.out.println("1. Linear Search");
    System.out.println("2. Binary Search");
    System.out.print("Enter your choice: ");
    int searchChoice = scanner.nextInt();
    
    System.out.println("Searching for number " + key + "...");
    switch (searchChoice) {
        case 1:
            Algorithm.Search.linearSearch(numbers, key);
            break;
        case 2:
            Algorithm.Search.binarySearch(numbers, key);
            break;
        default:
            System.out.println("Invalid choice. Search canceled.");
            return;
    }
}
}