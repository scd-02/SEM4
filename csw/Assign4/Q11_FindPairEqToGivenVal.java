import java.util.HashSet;

public class Q11_FindPairEqToGivenVal {
  public static void findPair(int[] arr, int size, int value) {
    HashSet<Integer> hs = new HashSet<Integer>();
    int i;
    for (i = 0; i < size; i++) {
      if (hs.contains(value - arr[i])) {
        System.out.println("The pair is : " + arr[i] + " , " + (value - arr[i]));

      }
      hs.add(arr[i]);
    }

  }

  public static void main(String[] args) {
    int a[] = { 2, 1, 5, 6 };
    findPair(a, a.length, 7);
  }
}
