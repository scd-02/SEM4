import java.util.Deque;
import java.util.LinkedList;

public class CheckConnected {

	public static boolean isConnected(int g[][]) {

		Deque<Integer> q = new LinkedList<>();
		boolean visited[] = new boolean[g.length];

		q.add(0);
		visited[0] = true;
		int count = 1;

		while (!q.isEmpty()) {
			int u = q.poll();
			for (int j = 0; j < g[u].length; j++) {
				if (g[u][j] == 1 && visited[j] == false) {
					q.add(j);
					visited[j] = true;
					count++;
				}
			}
		}

		return count == g.length;
	}

	public static int[][] convertToTree(int g[][]) {
		int temp[][] = g;
		if (isConnected(g)) {
			for (int i = 0; i < g.length; i++) {
				for (int j = 0; j < g[i].length; j++) {
					if (g[i][j] == 1) {
						temp[i][j] = 0;
						temp[j][i] = 0;
						if (!isConnected(temp)) {
							temp[i][j] = 1;
							temp[j][i] = 1;
						}
					}
				}
			}
		} else {
			System.out.println("Tree is not connected");
		}

		return temp;
	}

	public static void display(int g[][]) {
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g[i].length; j++) {
				System.out.print(g[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int g1[][] = { { 0, 1, 0, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 0, 1, 0 } };
		System.out.println(isConnected(g1));

		int g2[][] = { { 0, 1, 0, 1 }, { 1, 0, 1, 0 }, { 0, 1, 0, 1 }, { 1, 0, 1, 0 } };
		int tree[][] = convertToTree(g2);
		display(tree);

		int[][] g3 = GraphGenerator.generator(10);
		display(g3);
		System.out.println(isConnected(g3));
		g3= convertToTree(g3);
		display(g3);
		
	}

}
