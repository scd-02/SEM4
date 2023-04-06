public class ArrayIndexMaxDiffI_J {

  // t(n)= O(n); s(n)=O(n)
  public static int maxDiff_I_J(int a[], int size) {
    int left[] = new int[size];
    int right[] = new int[size];

    left[0] = a[0];
    for (int i = 1; i < size; i++) {
      left[i] = Math.min(left[i - 1], a[i]);
    }

    right[size - 1] = a[size - 1];
    for (int i = size - 2; i >= 0; i--) {
      right[i] = Math.max(right[i + 1], a[i]);
    }

    int i = 0, j = 0, diff = 0;

    while (i < size && j < size) {
      if (left[i] < right[j]) {
        diff = Math.max(diff, j - i);
        j++;
      } else {
        i++;
      }
    }
    return diff;
  }

  public static void main(String[] args) {
    int[] arr = { 33, 9, 10, 3, 2, 60, 30, 33, 1 };
    System.out.println(maxDiff_I_J(arr, arr.length));
  }
}
