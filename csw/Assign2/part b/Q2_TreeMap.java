import java.util.Map;
import java.util.TreeMap;

public class Q2_TreeMap {

  static class Address {
    int plot_no;
    String at;
    String post;

    Address(int pn, String at, String post) {
      this.plot_no = pn;
      this.at = at;
      this.post = post;
    }
  }

  public static void main(String[] args) {

    /*
     * TreeMap:-
     * contains unique elements
     * cannot have a null key but can have multiple null values
     * not synchronised
     * maintains ascending order
     */

    TreeMap<String, Address> tm = new TreeMap<>();

    // Inserting
    tm.put("Sourav1", new Address(123, "BDB1", "purnea1"));
    tm.put("Sourav2", new Address(124, "BDB2", "purnea2"));
    tm.put("Sourav3", new Address(125, "BDB3", "purnea3"));
    tm.put("Sourav", null);

    //Delete
    tm.remove("Sourav");

    // Displaying TreeMap
    for (Map.Entry<String, Address> map : tm.entrySet()) {
      String name = map.getKey();
      Address add = map.getValue();
      System.out.println(name + " : " + add.plot_no + " " + add.at + " " + add.post);
    }

  }
}
