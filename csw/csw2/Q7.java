
public class Q7 {

	public static void arrange0s1s2s(int a[]) {
		int size = 0;
		for (int i = 0, j = -1; i < a.length; i++) {
			if (a[i] == 2 && j == -1)
				j = i;
			if (a[i] != 2 && j != -1) {
				swap(a, j, i);
				j++;
			}
			size = j;
		}

		for (int i = 0, j = -1; i < size; i++) {

			if (a[i] == 1 && j == -1)
				j = i;
			if (a[i] != 1 && j != -1) {
				swap(a, j, i);
				j++;
			}
		}

	}

	public static void swap(int a[], int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 0, 1, 2, 2, 2, 0, 0, 2, 1, 0 };
		arrange0s1s2s(a);
		for (int e : a) {
			System.out.print(e + " ");
		}
	}

}
