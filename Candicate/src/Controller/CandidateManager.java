package Controller;

import Model.Candidate;
import Model.Experience;
import Model.Fresher;
import Model.Internship;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CandidateManager {
    private List<Experience> eList = new ArrayList<>();
    private List<Fresher> fList = new ArrayList<>();
    private List<Internship> iList = new ArrayList<>();
    static private List<Candidate> cList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//    public void Getcandidate(){
//        System.out.println("Enter ID:");
//        String id = sc.nextLine();
//        System.out.println("Enter first name: ");
//        String fn = sc.nextLine();
//        System.out.println("Enter last name: ");
//        String ln = sc.nextLine(); 
//        System.out.println("Enter Date of Birth(dd/MM/yyyy>1900): ");
//        String dob = sc.nextLine();
//        String[] test=dob.split("/");
//         try {
//            int year= Integer.parseInt(test[2]);
//            if (year<=1900||year>2024){
//                System.out.println("Invalid input!");
//                System.exit(0);
//            }
//            Date date = formatter.parse(dob);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Enter address: ");
//        String address =sc.nextLine();
//        System.out.println("Enter phone number: ");
//        Long phone=sc.nextLong();
//        while(String.valueOf(phone).length()<9){
//            System.out.println("Invalid phone number.Enter phone number again: ");
//            phone=sc.nextLong();    
//        }
//        
//       String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
//        Pattern pattern = Pattern.compile(emailRegex);
//        boolean isValid = false;
//
//        do {
//            System.out.print("Enter email: ");
//            String email = sc.nextLine();
//            Matcher matcher = pattern.matcher(email);
//
//            if (matcher.matches()) {
//                isValid = true;
//            } else {
//                System.out.println("Invalid input. Please enter email again: ");
//            }
//        } while (!isValid);  
//    }                 


    public void getEx(){
        System.out.println("Enter ID:");
        String id = sc.nextLine();
        System.out.println("Enter first name: ");
        String fn = sc.nextLine();
        System.out.println("Enter last name: ");
        String ln = sc.nextLine(); 
        Date date = null;
        String email="";
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter Date of Birth (dd/MM/yyyy > 1900): ");
                String dob = sc.nextLine();
                String[] test = dob.split("/");
                int year = Integer.parseInt(test[2]);
                
                if (year <= 1900 || year > 2024) {
                    System.out.println("Invalid input! Please try again.");
                    continue;
                }
                
                date = formatter.parse(dob);
                validInput = true;
            } catch (ParseException e) {
                System.out.println("Invalid input! Please try again.");
            }
        }
        System.out.println("Enter address: ");
        String address =sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phone=sc.nextLong();
        while(String.valueOf(phone).length()<10){
            System.out.println("Invalid phone number.Enter phone number again: ");
            phone=sc.nextLong();    
        }
        
       String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        boolean isValid = false;

        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter email again: ");
            }
        } while (!isValid);  
        String t = "0";
        System.out.println("Enter year of experience: ");
        int e = sc.nextInt();
        System.out.println("Enter Professional Skill: ");
        String ps = sc.nextLine();
        Experience ex = new Experience(e,ps,fn,ln,date,address,phone,email,t,id);
        eList.add(ex);
    }
    
    public void getFr(){
        System.out.println("Enter ID:");
        String id = sc.nextLine();
        System.out.println("Enter first name: ");
        String fn = sc.nextLine();
        System.out.println("Enter last name: ");
        String ln = sc.nextLine(); 
        Date date = null;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter Date of Birth (dd/MM/yyyy > 1900): ");
                String dob = sc.nextLine();
                String[] test = dob.split("/");
                int year = Integer.parseInt(test[2]);
                
                if (year <= 1900 || year > 2024) {
                    System.out.println("Invalid input! Please try again.");
                    continue;
                }
                
                date = formatter.parse(dob);
                validInput = true;
            } catch (ParseException e) {
                System.out.println("Invalid input! Please try again.");
            }
        }
        System.out.println("Enter address: ");
        String address =sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phone=sc.nextLong();
        while(String.valueOf(phone).length()<9){
            System.out.println("Invalid phone number.Enter phone number again: ");
            phone=sc.nextLong();    
        }
        String email="";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        boolean isValid = false;
        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter email again: ");
            }
        } while (!isValid);  
        String t = "1";
        System.out.println("Enter graduated date (dd/MM/yyyy): ");
        Date graduatedDate = null;
        validInput = false;
        while (!validInput) {
            try {
                String graduatedDateString = sc.nextLine();
                graduatedDate = formatter.parse(graduatedDateString);
                validInput = true;
            } catch (ParseException ex) {
                System.out.println("Invalid input! Please try again.");
            }
        }
        System.out.println("Enter Graduation rank: ");
        String rank =sc.nextLine();
        System.out.println("Enter University where you graduated : ");
        String u=sc.nextLine();
        Fresher fr = new Fresher(graduatedDate,rank,u,fn,ln,date,address,phone,email,t,id);
        fList.add(fr);
    }
    
    public void getInt(){
        String email="";
        Date date = null;
        System.out.println("Enter ID:");
        String id = sc.nextLine();
        System.out.println("Enter first name: ");
        String fn = sc.nextLine();
        System.out.println("Enter last name: ");
        String ln = sc.nextLine(); 
        System.out.println("Enter Date of Birth(dd/MM/yyyy>1900): ");
        String dob = sc.nextLine();
        String[] test=dob.split("/");
         try {
            int year= Integer.parseInt(test[2]);
            if (year<=1900||year>2024){
                System.out.println("Invalid input!");
                System.exit(0);
            }
             date = formatter.parse(dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Enter address: ");
        String address =sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phone=sc.nextLong();
        while(String.valueOf(phone).length()<9){
            System.out.println("Invalid phone number.Enter phone number again: ");
            phone=sc.nextLong();    
        }
        
       String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        boolean isValid = false;

        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter email again: ");
            }
        } while (!isValid);  
        System.out.println("Enter Major: ");
        String major = sc.nextLine();
        System.out.println("Enter semester: ");
        String semester = sc.nextLine();
        System.out.println("Enter University name: ");
        String un = sc.nextLine();
        String t = "2";
        Internship it = new Internship(major,semester,un,fn,ln,date,address,phone,email,t,id);
        iList.add(it);
    }                 
        
    
    public static void ViewAll(List<Candidate> v) {
        for (Candidate candidates : v) {
            System.out.println(candidates.toString());
        }
    }   
    
     public static void Search(Predicate<Candidate> p){
        List<Candidate> finds = new ArrayList<>();
        for (Candidate candidates : cList) {
            if(p.test(candidates)){
                finds.add(candidates);
            }
        }
        if (finds.isEmpty()){
            System.out.println("Nothing found");
        }
        else
        ViewAll(finds);     

    }
}