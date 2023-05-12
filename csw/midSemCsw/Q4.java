import java.util.Arrays;
import java.util.HashMap;

public class Q4 {

	static class SortApp {
		public static void reduction(int a[]) {
			Arrays.sort(a);
			int reduction = a[0];
			for (int i = 0; i < a.length; i++) {
				if (a[i] != reduction) {
					reduction = a[i];
					System.out.print((a.length - i) + " ");
				}
			}
		}

		public static void sortAccToGivArr(int a[], int b[]) {
			HashMap<Integer, Integer> map = new HashMap<>();

			for (int i = 0; i < a.length; i++) {
				if (map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i]) + 1);
				} else {
					map.put(a[i], 1);
				}
			}

			for (int i = 0; i < b.length; i++) {
				if(map.containsKey(b[i])) {
					int value = map.get(b[i]);
					for(int j=0;j<value;j++) {
						System.out.print(b[i]+" ");
					}
					map.remove(b[i]);
				}
			}
			
			for(int i=0;i<a.length;i++) {
				if(map.containsKey(a[i])) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 2, 3, 1, 1, 4, 4, 5 };
		SortApp.reduction(a);
		System.out.println();
		int b1[]= {2,1,4,5,3,2,1,6};
		int b2[]= {3,1,2};
		SortApp.sortAccToGivArr(b1, b2);
		
	}

}
