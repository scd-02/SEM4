import java.util.Arrays;

public class Q13_ElePairWithMinDiff {
  public static int pairWithMinDiff(int a[]) {
    int diff = Integer.MAX_VALUE;
    Arrays.sort(a);
    int first = a[0], second = a[1];
    for (int i = 1; i < a.length; i++) {
      if ((a[i] - a[i - 1]) < diff) {
        diff = a[i] - a[i - 1];
        first = a[i];
        second = a[i - 1];
      }
    }

    System.out.println(first + " " + second);

    return diff;
  }

  public static void main(String[] args) {
    int a[] = { 5, 5, 1, 2, -5, 6, 8 };
    System.out.println(pairWithMinDiff(a));
  }
}
