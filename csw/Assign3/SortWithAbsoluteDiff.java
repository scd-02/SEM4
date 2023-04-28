public class SortWithAbsoluteDiff {

  public static void sortWithAbsoDiff(int a[], int val) {
    for (int i = 0; i < a.length - 1; i++) {
      boolean flag = true;
      for (int j = 0; j < a.length - i - 1; j++) {
        if (absMore(a[j], a[j + 1], val))
          swap(a, j, j + 1);
        flag = false;
      }
      if (flag)
        break;
    }
  }

  public static boolean absMore(int i, int j, int v) {
    return Math.abs(i - v) > Math.abs(j - v);
  }

  public static void swap(int a[], int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void main(String[] args) {
    int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
    sortWithAbsoDiff(array, 5);
    for (int e : array) {
      System.out.print(e + " ");
    }
  }
}