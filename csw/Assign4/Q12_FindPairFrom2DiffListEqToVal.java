import java.util.HashSet;

public class Q12_FindPairFrom2DiffListEqToVal {

  public static void findPairFromTwoList(int a[], int b[], int val) {
    HashSet<Integer> hs = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
      hs.add(a[i]);
    }
    for (int i = 0; i < b.length; i++) {
      if (hs.contains(val - b[i])) {
        System.out.println(val - b[i] + "," + b[i]);
      }
    }
  }

  public static void main(String[] args) {
    int a[] = { 2, 1, 5, 6 };
    int b[] = { 1, 3, 2, -1, 7 };
    findPairFromTwoList(a, b, 4);
  }
}
