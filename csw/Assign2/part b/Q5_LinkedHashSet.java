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

    LinkedHashSet<String> lhs = new LinkedHashSet<>();

    // Insertion
    lhs.add("sourav");
    lhs.add("chandra");
    lhs.add("Sourav");
    lhs.add("book");
    lhs.add("book");
    lhs.add(null);

    // Traversal
    Iterator<String> it = lhs.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
  }
}
