
public class Q3 {

	public static void quickSort(int a[], int p, int r) {
		if (p < r) {
			int q = partition(a, p, r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
	}

	public static int partition(int a[], int p, int r) {
		int pivot = a[r];
		int i = p;
		for (int j = p; j < r; j++) {
			if (a[j] < pivot) {
				swap(a, i, j);
				i++;
			}
		}
		swap(a, r, i);
		return i;
	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int a[]= {12,3,4,1,7,2};
		quickSort(a,0,a.length-1);
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
