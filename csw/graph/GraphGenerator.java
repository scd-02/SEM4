
public class GraphGenerator {

	public static int[][] generator(int n){
		int g[][] = new int [n][n];
		for(int i = 0;i<n;i++) {
			for(int j= 0;j<n;j++) {
				g[i][j]= Math.random()>0.5?1:0;
			}
		}
		return g;
	}

}
