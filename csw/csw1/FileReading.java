import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class FileReading {

    public static Scanner sc = new Scanner(System.in);

    public static int askUser() {
        System.out.println("Want to sort With respect to");
        System.out.println("1. regd no.");
        System.out.println("2. First name");
        System.out.println("3. Last name");
        int value = sc.nextInt();
        return value;
    }

    public static void sort() throws IOException {

        // Reading file
        FileReader file = new FileReader("convertedText.txt");
        BufferedReader reader = new BufferedReader(file);

        // Writing to file
        FileWriter fileWriter = new FileWriter("Sorted.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = reader.readLine();
        bufferedWriter.write(line);
        line = reader.readLine();

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        // adding elements in list
        while (line != null) {

            String elements[] = line.split("[,\\s]");

            ArrayList<String> temp = new ArrayList<>();
            for (int i = 0; i < elements.length; i++) {
                temp.add(elements[i]);
            }

            list.add(temp);

            line = reader.readLine();
        }

        int value = askUser();

        if (value == 1) {
            Collections.sort(list, new Comparator<ArrayList<String>>() {
                public int compare(ArrayList<String> a, ArrayList<String> b) {
                    return ((String) a.get(0)).compareTo((String) b.get(0));
                }
            });
        } else if (value == 2) {
            Collections.sort(list, new Comparator<ArrayList<String>>() {
                public int compare(ArrayList<String> a, ArrayList<String> b) {
                    return ((String) a.get(1)).compareTo((String) b.get(1));
                }
            });
        } else if (value == 3) {
            Collections.sort(list, new Comparator<ArrayList<String>>() {
                public int compare(ArrayList<String> a, ArrayList<String> b) {
                    return ((String) a.get(a.size() - 1)).compareTo((String) b.get(a.size() - 1));
                }
            });
        }

        // Writing to Sorted file
        for (int i = 0; i < list.size(); i++) {
            String ans = list.get(i).get(0);
            for (int j = 1; j < list.get(i).size(); j++) {
                ans = ans + "," + list.get(i).get(j);
            }

            bufferedWriter.write(ans + "\n");
        }

        reader.close();
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {

        // Reading File
        FileReader file = new FileReader("[CSE3141] Attendance - Sheet1.csv");
        BufferedReader reader = new BufferedReader(file);

        // creating and writing to file
        FileWriter fileWriter = new FileWriter("convertedText.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = reader.readLine();

        // Filtering file
        while (line != null) {

            String ans[] = line.split(",+", 0);

            String result = ans[0];

            for (int i = 1; i < ans.length - 2; i++) {
                result = result + "," + ans[i];
            }

            bufferedWriter.write(result + "\n");
            line = reader.readLine();
        }

        sort();

        reader.close();
        bufferedWriter.close();
    }
}