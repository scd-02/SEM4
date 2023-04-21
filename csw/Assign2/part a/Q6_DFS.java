import java.util.Stack;

public class Q6_DFS {

  public static void dfs(int[][] G) {

    Stack<Integer> s = new Stack<>();
    boolean visited[] = new boolean[G.length];

    s.add(0);

    while (!s.empty()) {
      int u= s.pop();

      if(!visited[u]){
        System.out.print(u+" ");
        visited[u]=true;
      }

      for (int j = G[u].length-1; j >=0; j--) {
        if (G[u][j] == 1 && !visited[j]) {
          s.push(j);
        }
      }
      
    }
  }

  public static void main(String[] args) {
    int[][] G = {
        { 0, 1, 1, 0, 0 },
        { 1, 0, 1, 1, 0 },
        { 1, 1, 0, 0, 1 },
        { 0, 1, 0, 0, 1 },
        { 0, 0, 1, 1, 0 },
    };

    dfs(G);
  }
}
