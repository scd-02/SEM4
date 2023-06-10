import java.util.Arrays;

public class Q17_NoOfTriangles {
  public static int noOfTriangles(int a[], int n) {
    int count = 0;
    Arrays.sort(a);

    for (int i = 0; i < n - 2; i++) {
      int k = i + 2;
      for (int j = i + 1; j < n - 1; j++) {
        while (k < n && a[i] + a[j] > a[k])
          k++;

        count += k - j - 1;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int a[] = { 2, 1, 5, 3, 7, 15, 8 };
    System.out.println(noOfTriangles(a, a.length));
  }
}
