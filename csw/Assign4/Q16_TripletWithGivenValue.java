import java.util.Arrays;

public class Q16_TripletWithGivenValue {
  public static void findTriplet(int arr[], int size, int value) {
    int start, stop;
    Arrays.sort(arr);
    for (int i = 0; i < size - 2; i++) {
      start = i + 1;
      stop = size - 1;
      while (start < stop) {
        if (arr[i] + arr[start] + arr[stop] == value) {
          System.out.println("Triplet :" + arr[i] + " " + arr[start] + " " + arr[stop]);
          start += 1;
          stop -= 1;
        } else if (arr[i] + arr[start] + arr[stop] > value)
          stop -= 1;
        else
          start += 1;
      }
    }
  }

  public static void main(String[] args) {
    int a[] = { 2, 3, 7, 1, 5, 6, 2, 4 };
    findTriplet(a, a.length, 8);
  }
}
