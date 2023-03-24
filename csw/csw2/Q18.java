import java.util.Arrays;

public class Q18 {

  public static int kLargestEle(int a[], int k) {
    Arrays.sort(a);
    return a[k - 1];
  }

  public static void main(String[] args) {
    int a[] = { 5, 3, 2, 9, 6, 4 };
    System.out.println(kLargestEle(a, 4));
  }
}
