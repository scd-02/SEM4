import java.util.Arrays;

public class Q15_FindTripletWithSum0 {
  public static void zeroSumTriplets(int[] arr, int size) {
    int start, stop, i;
    Arrays.sort(arr);
    for (i = 0; i < (size - 2); i++) {
      start = i + 1;
      stop = size - 1;
      while (start < stop) {
        if (arr[i] + arr[start] + arr[stop] == 0) {
          System.out.println("Triplet : " + arr[i] + " " + arr[start] + " " + arr[stop]);
          start += 1;
          stop -= 1;
        } else if (arr[i] + arr[start] + arr[stop] > 0)
          stop -= 1;
        else
          start += 1;
      }
    }
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, -1, 3, -5 };
    zeroSumTriplets(a, a.length);
  }
}
