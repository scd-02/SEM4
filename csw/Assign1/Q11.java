public class Q11 {

  // t(n)=O(n);
  public static int findMaxSum(int a[]) {
    int sum = 0;
    int maxSum = 0;
    int currSum = 0;

    for (int i = 0; i < a.length; i++) {
      sum += a[i];
      currSum += a[i] * (i + 1);
    }

    maxSum = currSum;

    for (int i = a.length - 1; i > 0; i--) {
      currSum = (currSum + sum) - (a[i] * (i + 1));
      if (currSum > maxSum) {
        maxSum = currSum;
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {
    int a[] = { 3, 4, 1, 2, 5, 6 };
    System.out.println(findMaxSum(a));
  }
}
