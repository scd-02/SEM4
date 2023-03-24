public class Q9 {

  public static int equilibriumPoint(int a[]) {
    int leftSum = 0, rightSum = 0;
    for (int ele : a) {
      rightSum += ele;
    }
    for (int i = 0; i < a.length; i++) {
      rightSum -= a[i];
      if (rightSum == leftSum) {
        return i + 1;
      }
      leftSum += a[i];
    }
    return -1;
  }

  public static void main(String[] args) {
    int a[] = { 4, 2, 5, 5, 11 };
    System.out.println(equilibriumPoint(a));
  }
}