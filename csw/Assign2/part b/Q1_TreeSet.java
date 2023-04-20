import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q1_TreeSet {
  public static void main(String[] args) {

    /*
     * TreeSet :-
     * access and retrieval times are quite fast
     * doesnot allow null element
     * non synchronized
     * elements are in ascending order
     * contains unique element
     * search, remove, add takes O(log n) time
     */
    TreeSet<Integer> ts = new TreeSet<>();

    // Adding elements
    ts.add(5);
    ts.add(3);
    ts.add(1);
    ts.add(9);
    ts.add(15);
    ts.add(12);

    // (a) Display TreeSet
    Iterator<Integer> it = ts.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }

    // (b) Search
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNumber to be serached:");
    int input = sc.nextInt();
    if (ts.contains(input))
      System.out.println("Found");
    else
      System.out.println("Not Found");

    // (c) Deletion
    System.out.println("Number to be deleted:");
    int del = sc.nextInt();
    if (ts.contains(del))
      ts.remove(del);
    System.out.println(ts);

    sc.close();
  }
}