public class Q16 {

  public static int continuousSum(int a[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < a.length; i++) {
      currSum += a[i];

      if (currSum > maxSum) {
        maxSum = currSum;
      }

      if (currSum < 0) {
        currSum = 0;
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {
    int a[] = { -2, -4, -1, -3 };
    System.out.println(continuousSum(a));
  }

}
