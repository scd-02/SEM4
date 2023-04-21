
public class CountingSort {

	public static void countingSort(int a[]) {
		int max = Integer.MIN_VALUE;
		for (int e : a) {
			max = Math.max(max, e);
		}

		int index[] = new int[max + 1];

		for (int i = 0; i < a.length; i++) {
			index[a[i]]++;
		}

		for (int i = 0, count = 0; i < index.length; i++) {
			if (index[i] != 0) {
				for (int k = 0; k < index[i]; k++) {
					a[count++] = i;
				}
			}
		}

		for (int e : a) {
			System.out.print(e + " ");
		}

	}

	public static void main(String[] args) {

		int a[] = { 2, 6, 4, 1, 5, 8, 1, 4, 6, 1 };
		countingSort(a);
	}

}
