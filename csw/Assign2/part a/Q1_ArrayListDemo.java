import java.util.ArrayList;
import java.util.Scanner;

public class Q1_ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // Insert
    list.add(23);
    list.add(34);
    list.add(16);
    list.add(19);
    list.add(3);

    // (a)Display
    for (Integer e : list) {
      System.out.print(e + " ");
    }

    // (b)Search
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number to be searched:");
    int n = sc.nextInt();
    System.out.println(list.contains(n));

    // (c)Remove
    System.out.println("Enter index to be removed:");
    int i = sc.nextInt();
    list.remove(i);
    System.out.println(list);

    // (d)Size
    if (list.size() == 0) {
      System.out.println("Empty");
    } else {
      System.out.println("Not Empty");
    }

    sc.close();
  }
}