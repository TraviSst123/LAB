package Controller;

import Model.Library;
import Model.Validation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {
    Scanner sc = new Scanner(System.in);
    Validation vl = new Validation();
    private List<Library> sL = new ArrayList<>();
    public void getS(){
        int count = 0;
        boolean continueInput = true;
        System.out.println("Enter student's details (at least 10)");
        while (continueInput) {
            String id = vl.getNonEmptyString("Enter ID:");
            String name = vl.getNonEmptyString("Enter Name:");
            String course = vl.get123("Enter Course(1.Java\t2..Net\t3.C/C++): ");   
            String semester = vl.getNonEmptyString("Enter Semester:");
            Library student = new Library(name, course, id, semester);
            sL.add(student);
            count++;
            
            if (count >= 10) {
                System.out.println("You have entered 10 students.");
                System.out.println("Do you want to continue? (Enter N to exit)");
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("N")) {
                    continueInput = false;
                }
            }
        }
    }
    
    public void searchS(){
        if (sL.isEmpty()) {
        System.out.println("Nothing in library.");
        return;
    }
        System.out.println("Enter student name to search:");
        String searchName = sc.nextLine();
        List<Library> searchResults = searchStudentsByName(searchName);
        if (searchResults.isEmpty()) {
            System.out.println("No students found with the given name.");
        } else {
            System.out.println("Search results:");
            for (Library student : searchResults) {
                System.out.println(student.getName() + " - " + student.getId());
            }
        }
    }
    
    public List<Library> searchStudentsByName(String name) {
        List<Library> results = new ArrayList<>();
        for (Library student : sL) {
            if (student.getName().equalsIgnoreCase(name)) {
                results.add(student);
            }
        }
        return results;
    } 
    

    
    public void SortByStudentName() {
        if (sL.isEmpty()) {
        System.out.println("Nothing in library.");
        return;
    }
        Collections.sort(sL, new Comparator<Library>() {
            @Override
            public int compare(Library student1, Library student2) {
                return student1.getName().compareToIgnoreCase(student2.getName());
            }
        });
    }
    
    public void updateById(String id) {
        if (sL.isEmpty()) {
        System.out.println("Nothing in library.");
        return;
    }
        int count = 0;
        for (Library student : sL) {
            if (student.getId().equalsIgnoreCase(id)) {
            System.out.println("Enter new name (leave blank to keep the original name):");
            String newName = sc.nextLine();
            if (!newName.isEmpty()) {
                student.setName(newName);
            }
            System.out.println("Enter new semester (leave blank to keep the original semester):");
            String newSemester = sc.nextLine();
            if (!newSemester.isEmpty()) {
                student.setSemester(newSemester);
            }
            System.out.println("Enter new course (leave blank to keep the original course):");
            String newCourse = sc.nextLine();
            if (!newCourse.isEmpty()) {
                student.setCourse(newCourse);
                }
            count++;
            }
        }
        if (count == 0) {
        System.out.println("No students found with the given ID.");
        } else {
        System.out.println("Information updated successfully for " + count + " student(s).");
        }
    }
    public void deleteById(String id) {
        if (sL.isEmpty()) {
        System.out.println("Nothing in library.");
        return;
    }
        int count = 0;
        List<Library> removedStudents = new ArrayList<>();
        for (Library student : sL) {
            if (student.getId().equalsIgnoreCase(id)) {
                removedStudents.add(student);
                count++;
            }
        }
        sL.removeAll(removedStudents);
        if (count == 0) {
            System.out.println("No students found with the given ID.");
        } else {
            System.out.println("Deleted successfully for " + count + " students");
        }   
    }
    
  public void displayAllStudents() {
      if (sL.isEmpty()) {
        System.out.println("Nothing in library.");
        return;
    }
    System.out.println("Student name\t| Course\t| Total of Course");
    System.out.println("-----------------------------------------------");
    
    Map<String, Integer> courseCountMap = new HashMap<>();
    
    for (Library student : sL) {
        String id = student.getId();
        int courseCount = courseCountMap.getOrDefault(id, 0);
        courseCountMap.put(id, courseCount + 1);
    }
    
    for (Library student : sL) {
        String id = student.getId();
        int courseCount = courseCountMap.getOrDefault(id, 0);
        System.out.println(student.getName() + " | " + student.getCourse() + " | " + courseCount);
    }
}
}
