import java.util.Hashtable;
import java.util.Map;

public class HashTable {
  public static void main(String[] args) {
    /*
     * Hashtable
     * HashTable is an array of a list and Each list is known as a bucket.
     * contains unique elements
     * synchronized
     * doesn't allow null key or value
     */

    Hashtable<Integer, String> ht = new Hashtable<>();
    // Insertion
    ht.put(101, "sourav");
    ht.put(110, "chandra");
    ht.put(13, "dey");
    ht.put(302, "book");
    ht.put(101, "new value");

    // Traversal
    for (Map.Entry<Integer, String> map : ht.entrySet()) {
      System.out.println(map.getKey() + " " + map.getValue());
    }

    // Deletion
    ht.remove(13);

    System.out.println(ht);
  }
}
