import java.util.Collections;
import java.util.PriorityQueue;

public class Q18_SecondLargestWithMInComp {
  public static int secondLargest(int a[]) {
    PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < a.length; i++) {
      q.add(a[i]);
    }
    q.poll();
    return q.peek();
  }

  public static void main(String[] args) {
    int a[] = { 5, 1, 2, 7, 4, 6 };
    System.out.println(secondLargest(a));
  }
}
