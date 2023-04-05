public class RotateArray {

  // t(n) = O(3n)
  public static void rotate(int a[], int k) {
    int n = a.length - 1;
    reverse(a, 0, k - 1);
    reverse(a, k, n);
    reverse(a, 0, n);
  }

  public static void reverse(int a[], int s, int e) {
    while (s < e) {
      int temp = a[s];
      a[s++] = a[e];
      a[e--] = temp;
    }
  }

  public static void main(String[] args) {
    int a[] = { 4, 3, 5, 8, 6, 2 };
    rotate(a, 3);
    for (int i : a) {
      System.out.print(i + " ");
    }
  }
}
