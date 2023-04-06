public class MaxPathSum {

  public static int maxPathSum(int[] a, int[] b) {
    int i = 0, j = 0, sum1 = 0, sum2 = 0;
    int result = 0;
    while (i < a.length && j < b.length) {
      if (a[i] < b[j]) {
        sum1 += a[i];
        i++;
      } else if (b[j] < a[i]) {
        sum2 += b[j];
        j++;
      } else {
        result += Math.max(sum2, sum1);
        result += a[i];
        sum1 = 0;
        sum2 = 0;
        i++;
        j++;
      }
    }
    while (i < a.length) {
      sum1 += a[i++];
    }
    while (j < b.length) {
      sum2 += b[j++];
    }
    result += Math.max(sum2, sum1);
    return result;
  }

  public static void main(String[] args) {
    int[] arr1 = { 12, 13, 18, 20, 22, 26, 70 };
    int[] arr2 = { 11, 15, 18, 19, 20, 26, 30, 31 };
    System.out.println(maxPathSum(arr1, arr2));
  }
}
