import java.util.Arrays;

public class Q10_SumCloseTo0 {
  public static void minAbsSumPair(int[] arr, int size) {
    int l, r, minSum, sum, minFirst, minSecond;
    // Array should have at least two elements
    if (size < 2) {
      System.out.println("Invalid Input");
      return;
    }

    Arrays.sort(arr);

    // Initialization of values
    minFirst = 0;
    minSecond = size - 1;
    minSum = Math.abs(arr[minFirst] + arr[minSecond]);
    l = 0;
    r = size - 1;
    while (l < r) {
      sum = arr[l] + arr[r];
      if (Math.abs(sum) < minSum) {
        minSum = Math.abs(sum);
        minFirst = l;
        minSecond = r;
      }
      if (sum < 0)
        l++;
      else if (sum > 0)
        r--;
      else
        break;
    }

    System.out.println(" Minimum sum elements are : " + arr[minFirst] + " , " +
        arr[minSecond]);
  }

  public static void main(String[] args) {
    int a[] = { 5, 3, 2, -1 };
    minAbsSumPair(a, a.length);
    
  }
}
