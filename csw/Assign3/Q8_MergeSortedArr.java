public class Q8_MergeSortedArr {

  public static void merge(int a[], int b[]) {
    int index = 0;
    while (index < a.length) {
      if (a[index] < b[0])
        index++;
      else {
        int temp = a[index];
        a[index] = b[0];
        b[0] = temp;

        for (int i = 0; i < b.length - 1; i++) {
          if (b[i] < b[i + 1])
            break;
          int swap = b[i];
          b[i] = b[i + 1];
          b[i + 1] = swap;
        }
      }
    }
  }

  public static void display(int a[]) {
    for (int e : a) {
      System.out.print(e + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr1[] = { 1, 5, 9, 10, 15, 20 };
    int arr2[] = { 2, 3, 8, 13 };
    merge(arr1, arr2);
    display(arr1);
    display(arr2);
  }
}
