public class ArrangeVal {

  // t(n) = O(n)
  public static void arrange(int a[]) {
    for (int i = 0; i < a.length; i++) {
      while (a[i] != -1 && a[i] != i) {
        swap(a, a[i], i);
      }
    }
    for (int i : a) {
      System.out.print(i + " ");
    }
  }

  public static void swap(int a[], int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void main(String[] args) {
    int a[] = { 2, 4, -1, 0, 3, 5 };
    arrange(a);
  }
}
