import java.util.HashSet;
import java.util.Iterator;

public class Q4_HashSet {

  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<>();

    /*
     * HashSet
     * stores element by hashing
     * contains unique element only
     * allows null value
     * non synchronised
     * doesn't maintain insertion order (inserted on the basis of hashcode)
     */
    // Inserting
    hs.add("Sourav");
    hs.add("Chandra");
    hs.add("Harsh");
    hs.add("csw");
    hs.add("lab");
    hs.add(null);

    // Display
    for (String s : hs) {
      System.out.print(s + " ");
    }

    Iterator<String> it = hs.iterator();
    while(it.hasNext()){
      System.out.print(it.next()+" ");
    }

  }
}
