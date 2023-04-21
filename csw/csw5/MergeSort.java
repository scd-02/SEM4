
public class MergeSort {

	public static void mergeSort(int a[], int s, int e) {
		if (s < e) {
			int mid = (s + e) / 2;
			mergeSort(a, s, mid);
			mergeSort(a, mid + 1, e);
			merge(a, s, mid, e);
		}

	}

	public static void merge(int a[], int s, int mid, int e) {

		int left[] = new int[mid - s + 1];
		int right[] = new int[e - mid];

		for (int i = 0; i < left.length; i++) {
			left[i] = a[s + i];
		}
		
		for (int j = 0; j < right.length; j++) {
			right[j] = a[mid + 1 + j];
		}


		int k, i, j;
		i = j = 0;
		k = s;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length) {
			a[k++]=left[i++];
		}
		
		while(j<right.length) {
			a[k++]=right[j++];
		}
		

	}

	public static void main(String[] args) {
		int a[] = { 5, 3, 6, 1, 2, 8, 7, 7 };
		mergeSort(a, 0, a.length - 1);
		

		for (int e : a) {
			System.out.print(e + " ");
		}

	}

}
