import java.util.Arrays;

public class Q7_ArrayReduction {

  public static void arrReduction(int a[]) {
    Arrays.sort(a);
    int count = 1;
    int reduction = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] - reduction > 0) {
        System.out.println(a.length - i);
        reduction = a[i];
        count++;
      }
    }
    System.out.println("Total no of reductions: " + count);
  }

  public static void main(String[] args) {
    int arr[] = { 5, 1, 1, 1, 2, 3, 5 };
    arrReduction(arr);
  }
}
