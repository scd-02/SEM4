import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q5 {

	static class SearchApp {

		public static void twoNo(int a[]) {
			int xor = 0;
			for (int i = 0; i < a.length; i++) {
				xor ^= a[i];
			}

			int setBit = xor & (~(xor - 1));

			int first = 0, second = 0;
			for (int i = 0; i < a.length; i++) {
				if ((a[i] & setBit) == 0) {
					first ^= a[i];
				} else {
					second ^= a[i];
				}
			}

			System.out.println(first + " " + second);
		}

		public static void triplet(int a[], int value) {
			Arrays.sort(a);
			for (int i = 0; i < a.length; i++) {
				int s = i, e = a.length - 1;
				while (s < e) {
					if (a[i] + a[s] + a[e] == value) {
						System.out.println(a[i] + " " + a[s] + " " + a[e]);
						s++;
						e--;
					} else if (a[i] + a[s] + a[e] < value) {
						s++;
					} else {
						e--;
					}
				}
			}
		}

		public static int majorityEle(int a[]) {
			HashMap<Integer, Integer> map = new HashMap<>();
			
			for (int i = 0; i < a.length; i++) {
				if (map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i]) + 1);
				} else {
					map.put(a[i], 1);
				}
			}

			for (Map.Entry<Integer, Integer> e : map.entrySet()) {
				int value = e.getValue();
				if (value > a.length / 2) {
					return e.getKey();
				}
			}
			return -1;
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 1, 2, 3, 4, 4, 3 };
		SearchApp.twoNo(a);
		int b[] = { 3, 2, -1, -2, 5, 7 };
		SearchApp.triplet(b, 4);
		int c[] = {4,4,2,4,1};
		System.out.println(SearchApp.majorityEle(c));
	}

}
