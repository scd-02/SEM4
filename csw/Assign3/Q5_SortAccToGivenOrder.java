package assign3;

import java.util.HashMap;

public class Q5_SortAccToGivenOrder {

	public static void sortByOrder(int a[], int b[]) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}

		for (int i = 0; i < b.length; i++) {
			while (map.containsKey(b[i])) {
				System.out.print(b[i] + " ");
				map.put(b[i], map.get(b[i])-1);
				if (map.get(b[i]) == 0)
					map.remove(b[i]);
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			while (map.containsKey(a[i])) {
				System.out.print(a[i] + " ");
				map.put(a[i], map.get(a[i])-1);
				if (map.get(a[i]) == 0)
					map.remove(a[i]);
			}
		}
	}

}
