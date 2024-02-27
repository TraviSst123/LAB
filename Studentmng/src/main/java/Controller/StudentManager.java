package Controller;

import Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void displayMenu() {
        int choice = 0;
        do {
            clearScreen();
            System.out.println("====== Collection Sort Program ======");
            System.out.println("1. Enter student information");
            System.out.println("2. Display student information");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    enterStudentInformation();
                    break;
                case 2:
                    displayStudentInformation();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            pause();
        } while (choice != 3);
    }

    private void enterStudentInformation() {
        boolean moreStudents = true;
        do {
            clearScreen();
            System.out.println("Please input student information");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Classes: ");
            String classes = scanner.nextLine();

            float mark = 0;
            boolean validMark = false;
            while (!validMark) {
                System.out.print("Mark: ");
                String markInput = scanner.nextLine();
                try {
                    mark = Float.parseFloat(markInput);
                    validMark = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid mark. Please enter a valid number.");
                }
            }

            students.add(new Student(name, mark, classes));

            System.out.print("Do you want to enter more student information? (Y/N): ");
            String moreInput = scanner.nextLine();
            moreStudents = moreInput.equalsIgnoreCase("Y");
        } while (moreStudents);
    }

    private void displayStudentInformation() {
        clearScreen();
        System.out.println("----Student Information----");

        if (students.isEmpty()) {
            System.out.println("No student information available.");
        } else {
            Collections.sort(students, new StudentComparator());

            int studentNumber = 1;
            for (Student student : students) {
                System.out.println("Student " + studentNumber + ":");
                System.out.println("Name: " + student.getName());
                System.out.println("Classes: " + student.getClasses());
                System.out.println("Mark: " + student.getMark());
                System.out.println();
                studentNumber++;
            }
        }
    }

    class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getName().compareToIgnoreCase(student2.getName());
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void pause() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }
}