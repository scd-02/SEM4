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

//		int a4[] = { 10,6,7,5,8,9 };
//		int a4[]= {9,10,6,8,10,5,4};
//		assign3.Q4_BringAllEleLessThanGivenVal.eleLessThanGivenVal(a4, 8);
		
//		int a51[] = {2,1,2,5,7,1,9,3,6,8,8};
//		int a52[]= {2,1,8,3};
//		assign3.Q5_SortAccToGivenOrder.sortByOrder(a51, a52);
		
		
		int a[]= {2,3,5,6,7,7,9,1,8,10};
		assign3.Q6_SeparateOddAndEven.eleLessThanGivenVal(a);
		
	}

}
