public class ReverseOfANo {

  //t(n)=O(log n)
  public static int reverse(int n) {
    int reverse = 0;
    while (n != 0) {
      int rem = n % 10;
      reverse = (reverse * 10) + rem;
      n = n/10;
    }
    return reverse;
  }

  public static void main(String[] args) {
    System.out.println(reverse(5674883));
  }
}
