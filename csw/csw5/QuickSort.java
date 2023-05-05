
public class QuickSort {

	public static void quickSort(int a[], int s, int e) {
		if (s < e) {
			int q = partition(a, s, e);
			quickSort(a, s, q - 1);
			quickSort(a, q + 1, e);
		}
	}

	public static int partition(int a[], int s, int e) {
		int pivot = a[e];
		int i = s ;
		for (int j = s; j < e; j++) {
			if (a[j] <= pivot) {
				swap(a, i, j);
				i = i + 1;
			}
		}
		swap(a, i, e);

		return i;
	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int a[] = { 5, 3, 6, 1, 2, 8, 7, 7 };
		quickSort(a,0,a.length-1);
		for(int e: a) {
			System.out.print(e+" ");
		}
	}

}
