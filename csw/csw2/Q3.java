import java.util.HashMap;

public class Q3 {

	public static int firstOccKNoOfTimes(int a[], int k) {
		HashMap<Integer, Integer> hs = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (hs.containsKey(a[i])) {
				if ((hs.get(a[i]) + 1) == k) {
					return a[i];
				}
				hs.put(a[i], hs.get(a[i]) + 1);
			} else {
				hs.put(a[i], 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 3, 4, 1, 3, 3, 2 };
		System.out.println(firstOccKNoOfTimes(a, 3));

	}

}
