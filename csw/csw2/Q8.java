import java.util.ArrayList;

public class Q8 {

	public static void leaders(int a[]) {
		ArrayList<Integer> list = new ArrayList<>();
		int maxTillNow = Integer.MIN_VALUE;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] > maxTillNow) {
				list.add(a[i]);
				maxTillNow = a[i];
			}
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void main(String[] args) {

		int a[] = { 1, 9, 7, 3, 4, 5, 2 };
		leaders(a);

	}

}
