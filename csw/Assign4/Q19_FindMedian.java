import java.util.Arrays;

public class Q19_FindMedian {
  public static int getMedian(int[] arr, int size) {
    Arrays.sort(arr);
    return arr[size / 2];
  }

  public static void main(String[] args) {
    int a[] = { 3, 5, 9, 10, 7, 11 };
    System.out.println(getMedian(a, a.length));
  }
}
