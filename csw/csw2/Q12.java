import java.util.HashSet;

public class Q12 {

  public static boolean isSubset(int a1[], int a2[]) {
    HashSet<Integer> hs = new HashSet<>();

    for (int i = 0; i < a1.length; i++) {
      if (!hs.contains(a1[i]))
        hs.add(a1[i]);
    }

    int a1_Size = hs.size();

    for (int i = 0; i < a2.length; i++) {
      if (!hs.contains(a2[i]))
        hs.add(a2[i]);
    }

    return (hs.size() == a1_Size) ? true : false;

  }

  public static void main(String[] args) {
    int a1[] = { 1, 2, 3, 11, 3, 7, 9 };
    int a2[] = { 2, 9, 11, 12 };

    System.out.println(isSubset(a1, a2));
  }
}
