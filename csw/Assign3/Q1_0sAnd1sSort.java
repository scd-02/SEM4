package assign3;

public class Q1_0sAnd1sSort {

	public static void sort0sAnd1s(int a[]) {
		int index = -1;
		int swap = 0;
		for (int i = 0; i < a.length; i++) {
			if (index == -1 && a[i] == 1) {
				index = i;

			}
			if (index != -1 && a[i] != 1) {
				assign3.Main.swap(a, index, i);
				index++;
				swap++;
			}
		}
		System.out.println("NO of swaps:" + swap);
		assign3.Main.display(a);
	}

}
