import java.util.Stack;

public class Q4_PostFix {

  public static int postFix(String n) {

    Stack<Integer> s = new Stack<>();

    int i = 0;
    while (i < n.length()) {
      char c = n.charAt(i);
      if (Character.isDigit(c)) {
        s.push(c - '0');
      } else {
        int val1 = s.pop();
        int val2 = s.pop();
        switch (c) {
          case '+':
            s.push(val2 + val1);
            break;
          case '-':
            s.push(val2 - val1);
            break;
          case '*':
            s.push(val2 * val1);
            break;
          case '/':
            try {
              s.push(val2 / val1);
            } catch (Exception e) {
              System.out.println(e);
              System.exit(0);
            }
            break;
        }
      }
      i++;
    }

    return s.pop();
  }

  public static void main(String[] args) {

    System.out.println(postFix("824*/"));

  }
}
