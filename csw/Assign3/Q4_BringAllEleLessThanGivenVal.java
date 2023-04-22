package assign3;

public class Q4_BringAllEleLessThanGivenVal {
	
	public static void eleLessThanGivenVal(int a[], int val) {
		int index = -1;
		int swap = 0;
		for (int i = 0; i < a.length; i++) {
			if (index == -1 && a[i] >= val) {
				index = i;

			}
			if (index != -1 && a[i] < val) {
				assign3.Main.swap(a, index, i);
				index++;
				swap++;
			}
		}
		System.out.println("NO of swaps:" + swap);
		assign3.Main.display(a);
	}
	
}
