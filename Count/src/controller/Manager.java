
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import model.Library;
import view.Menu;

public class Manager extends Menu {
        public Manager() {
        super("\nMenu", new String[]{"Enter String", "Count number of Words", "Count number of Letters","Exit"});
    }

        @Override
        public void execute(int choice) {
        switch (choice) {
            case 1:
                getS();
                break;
            case 2:
                countWord();
                break;
            case 3:
                countLetters(lb.getString());
                break;
            case 4:
                System.out.println("Exitting program...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    
    Scanner sc = new Scanner(System.in);
    Library lb = new Library();
    
    public void getS(){
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        lb.setString(s);
        System.out.println("String saved");
    }
    
    public void countWord(){
        HashMap<String, Integer> hashmap= new HashMap<>();
        StringTokenizer st = new StringTokenizer(lb.getString());
        int count=0;
        while(st.hasMoreTokens()){
             String word="";
             String token = st.nextToken();
             for(int i=0;i<token.length();i++){
                char c = token.charAt(i);
                if (Character.isLetter(c)){
                    c = Character.toLowerCase(c); 
                    word+=c;
                }
             }
                if (hashmap.containsKey(word)) {
                hashmap.put(word, hashmap.get(word) + 1);
            } else {
                hashmap.put(word, 1);
                }           
        }
        for (HashMap.Entry<String, Integer> entry : hashmap.entrySet()) {
        String k = entry.getKey();
        int count1 = entry.getValue();
        System.out.println("Word " + k + ": " + count1);
        }
    }
    
    public int countLetters(String input) {
        HashMap<Character, Integer> letterCountMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                count++;
                c = Character.toLowerCase(c); 
                if (letterCountMap.containsKey(c)) {
                letterCountMap.put(c, letterCountMap.get(c) + 1);
            } else {
                letterCountMap.put(c, 1);
                }
            }
        }
        System.out.println("Number of Letters: "+count);
        for (HashMap.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
        char c = entry.getKey();
        int count1 = entry.getValue();
        System.out.println("Character " + c + ": " + count1);
    }
        return 0;
    }
        
//    public boolean Exception(String tk){       
//        for (int i = 0; i < tk.length(); i++) {
//            char c = tk.charAt(i);
//            if (Character.isLetter(c)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
