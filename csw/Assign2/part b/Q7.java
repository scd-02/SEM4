import java.util.HashSet;
import java.util.Scanner;

public class Q7 {
  public static void main(String[] args) {

    HashSet<Integer> set = new HashSet<>();

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of N:");
    int n = sc.nextInt();

    while (n-- > 0) {
      int num = sc.nextInt();
      set.add(num);
    }

    System.out.println(set);
    sc.close();
  }
}
