    package Model;

    import java.io.*;
    import java.util.HashMap;
    import java.util.Map;
 import Model.Validation;
    public class Dictionary {

        private Map<String, String> dict;

        public Dictionary() {
            dict = new HashMap<>();
        }

        public void loadData() throws FileNotFoundException, IOException {
            File f = new File("dictionary.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                String line = br.readLine();
                if (line == null || line.isEmpty()) {
                    break;
                }
                String[] words = line.split("[-]");
                String eng = words[0].trim(), vi = words[1].trim();
                dict.put(eng, vi);
            }
            br.close();
            fr.close();
        }

        public void saveData() throws IOException {
            File f = new File("dictionary.txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Map.Entry<String, String> entry : dict.entrySet()) {
                bw.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
            bw.close();
            fw.close();
        }

        public void addWord(String english, String vietnamese) throws IOException {
            if (dict.containsKey(english)) {
                if (!Validation.getYN(english + " is already existed in the dictionary. Do you want to update? (Y/N)")) {
                    return;
                }
            }
            dict.put(english, vietnamese);
            saveData();
            System.out.println("Add successful.");
        }

        public void removeWord(String english) throws IOException {
            if (!dict.containsKey(english)) {
                System.err.println("Not found.");
                return;
            }
            dict.remove(english);
            saveData();
            System.out.println("Delete successful.");
        }

        public String translate(String english) {
            if (!dict.containsKey(english)) {
                return "Not found.";
            }
            return dict.get(english);
        }
    }