public class WaveForm {

  // t(n) = O(n)
  public static void waveForm(int a[]) {
    for (int i = 1; i < a.length; i = i + 2) {
      if (i - 1 >= 0 && a[i] < a[i - 1]) {
        swap(a, i, i - 1);
      }
      if (i + 1 < a.length && a[i + 1] > a[i]) {
        swap(a, i, i + 1);
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
    int a[] = { 5, 3, 6, 4, 8, 9 };
    waveForm(a);
  }
}
