public class Q10 {

  public static int buyAndSellStock(int a[]) {
    int profit = 0;
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] < a[i + 1]) {
        profit += a[i + 1] - a[i];
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    int a[] = { 2, 3, 5, 8, 1, 2, 6 };
    System.out.println(buyAndSellStock(a));
  }
}
