package assign3;

public class Q6_SeparateOddAndEven {

	public static void eleLessThanGivenVal(int a[]) {

		int first = 0;
		int second = a.length - 1;

		while (first < second) {
			if ((a[first] & 1) == 0) {
				first++;
			} else if ((a[second] & 1) == 1) {
				second--;
			} else {
				assign3.Main.swap(a, first, second);

			}
		}

		assign3.Main.display(a);
	}
}
