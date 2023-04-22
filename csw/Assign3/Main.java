package assign3;

public class Main {

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void display(int a[]) {
		for (int e : a) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		int a1[] = { 0, 0, 1, 1, 1, 0, 1, 0, 0, 1 };
//		assign3.Q1_0sAnd1sSort.sort0sAnd1s(a1);

//		int a2[] = { 0, 0, 1, 2, 1, 2, 1, 0, 2, 1, 2, 2, 0, 2 };
//		assign3.Q2_0s1s2sSort.sort0s1s2s(a2);

		int a3[] = { 10,6,7,5,8,5,9 };
		assign3.Q4_BringAllEleLessThanGivenVal.eleLessThanGivenVal(a3, 8);
		
		

	}

}
