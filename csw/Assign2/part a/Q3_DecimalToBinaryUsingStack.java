import java.util.Stack;

public class Q3_DecimalToBinaryUsingStack {

  public static long binary(int n) {

    Stack<Integer> s = new Stack<>();
    while (n != 0) {
      s.push(n % 2);
      n = n >> 1;
    }

    long binary = 0l;
    while (!s.empty()) {
      binary = binary * 10 + s.pop();
    }

    return binary;
  }

  public static void main(String[] args) {
    System.out.println(binary(19));
  }
}
