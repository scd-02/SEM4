
public class MaximumMinimumArray {

	public static int[] maxMinArr(int a[]) {

		int ans[] = new int[a.length];

		for (int k = 0; k < a.length; k++) {
			ans[k] = a[k];
		}

		int i = 0, j = a.length - 1;
		for (int k = 0; k < a.length; k++) {
			if (k % 2 == 0) {
				a[k] = ans[j--];
			} else {
				a[k] = ans[i++];
			}
		}

		return a;
		//t(n)= O(n), s(n)=O(n)
	}

	public static int[] maxMinArr2(int a[]) {
		for (int i = 0; i < a.length; i++) {
			reverse(a, i, a.length - 1);
		}
		return a;
		//t(n)= O(n^2)
	}

	public static void reverse(int a[], int s, int e) {
		while (s < e) {
			int temp = a[s];
			a[s++] = a[e];
			a[e--] = temp;
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		a = maxMinArr2(a);
		for (int e : a) {
			System.out.print(e + " ");
		}
		
	}

}
