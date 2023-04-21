
public class InsertionSort {

	public static void insertionSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;
			while (j > 0 && a[j] > temp) {
				if (a[j] > temp) {
					a[j] = a[j + 1];
					j--;
				}
			}
			a[j] = temp;
		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 3, 6, 1, 2, 8 };
		insertionSort(a);
		for (int e : a) {
			System.out.print(e + " ");
		}

	}

}
