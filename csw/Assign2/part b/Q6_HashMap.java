import java.util.HashMap;
import java.util.Map;

public class Q6_HashMap {
  public static void main(String[] args) {
    /*
     * HashMap
     * contains value based on key
     * contains unique keys
     * may have one null key and multiple null values
     * non synchronized
     * maintains no order
     */

    HashMap<Integer, String> hm = new HashMap<>();

    // Insertion
    hm.put(101, null);
    hm.put(102, null);
    hm.put(111, "Sourav");
    hm.put(null, "null");
    hm.put(null, "Sourav");

    // Traversal
    for (Map.Entry<Integer, String> map : hm.entrySet()) {
      System.out.println(map.getKey() + " " + map.getValue());
    }

    for (Integer key : hm.keySet()) {
      System.out.println(key + " " + hm.get(key));
    }

  }
}
