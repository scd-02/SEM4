public class BinaryEqv {

  public static int binaryEqv(int n) {

    int binary = 0;
    int count = 0;

    while (n != 0) {
      int rem = n & 1;
      double c = Math.pow(10, count);
      binary += rem * c;
      n = n >> 1;
      count++;
    }

    return binary;
  }

  public static void main(String[] args) {
    System.out.println(binaryEqv(17));
  }
}
