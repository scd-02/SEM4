import java.util.Stack;

public class Stack_StockSpan {

	public static int[] stockSpanBF(int price[], int n) {
		int ans[] = new int[n];

		ans[0] = 1;
		for (int i = 1; i < n; i++) {
			ans[i] = 1;
			int j = i - 1;
			while (j >= 0 && price[j] <= price[i]) {
				ans[i]++;
				j--;
			}
		}

		return ans;
	}

	public static int[] stockSpanSI(int price[], int n) {
		int ans[] = new int[n];

		Stack<Integer> range = new Stack<Integer>();

		ans[0] = 1;
		range.push(0);

		for (int i = 1; i < n; i++) {
			while (!range.empty() && price[range.peek()] <= price[i]) {
				range.pop();
			}

			ans[i] = (range.empty()) ? (i + 1) : (i - range.peek());
			range.push(i);
		}

		return ans;
	}

	public static void main(String[] args) {
		int price[] = { 20, 14, 9, 17, 15, 17, 19 };
		int ansBF[] = stockSpanBF(price, price.length);
		int ansSI[] = stockSpanSI(price, price.length);
		

		for (int e : ansBF) {
			System.out.print(e + " ");
		}
		
		System.out.println();
		
		for (int e: ansSI) {
			System.out.print(e + " ");
		}
	}

}
