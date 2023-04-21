import java.util.ArrayDeque;

public class Q5_BFS {

  public static void bfs(int[][] G) {

    ArrayDeque<Integer> q = new ArrayDeque<>();
    boolean visited[] = new boolean[G.length];

    q.add(0);
    visited[0] = true;

    while (!q.isEmpty()) {
      int u = q.poll();
      System.out.print(u + " ");
      for (int j = 0; j < G[u].length; j++) {
        if (G[u][j] == 1 && !visited[j]) {
          q.add(j);
          visited[j] = true;
        }
      }
    }

  }

  public static void main(String[] args) {
    int[][] G = {
        { 0, 1, 0, 0, 1 },
        { 1, 0, 1, 0, 0 },
        { 0, 1, 0, 1, 0 },
        { 0, 0, 1, 0, 1 },
        { 1, 0, 0, 1, 0 },
    };

    bfs(G);

  }
}
