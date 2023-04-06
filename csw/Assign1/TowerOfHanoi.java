public class TowerOfHanoi {

  public static void towerOfHanoi(int n, char s, char d, char t) {
    if (n == 0)
      return;
    towerOfHanoi(n - 1, s, t, d);
    System.out.println("Disc " + n + " moved from " + s + " to " + d);
    towerOfHanoi(n - 1, t, d, s);
  }

  public static void main(String[] args) {
    towerOfHanoi(3, 'A', 'B', 'T');
  }
}
