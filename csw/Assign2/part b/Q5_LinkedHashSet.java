import java.util.Iterator;
import java.util.LinkedHashSet;

public class Q5_LinkedHashSet {
  public static void main(String[] args) {
    /*
     * LinkedHashSet
     * Hashtable and LinkedList implementation of the Set interface
     * contains unique elements only
     * permits null elements
     * non synchronized
     * maintains insertion order
     */

    LinkedHashSet<Double> lhs = new LinkedHashSet<>();

    // Insertion
    lhs.add(23.51);
    lhs.add(27.56);
    lhs.add(21.54);
    lhs.add(45.98);
    lhs.add(16.34);
    

    // Traversal
    Iterator<Double> it = lhs.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
  }
}
