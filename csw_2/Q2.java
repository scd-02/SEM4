import java.util.Arrays;
import java.util.HashMap;

public class Q2 {

	public static boolean checkArrayUsingMap(int[] a, int[] b) {

		HashMap<Integer, Integer> hs1 = new HashMap<>();
		HashMap<Integer, Integer> hs2 = new HashMap<>();

		for (int i = 0; i < a.length; i++) {

			if (hs1.containsKey(a[i])) {
				hs1.put(a[i], hs1.get(a[i]) + 1);
			} else {
				hs1.put(a[i], 1);
			}
		}

		System.out.println(hs1);
		for (int i = 0; i < b.length; i++) {

			if (hs2.containsKey(b[i])) {
				hs2.put(b[i], hs2.get(b[i]) + 1);
			} else {
				hs2.put(b[i], 1);
			}
		}
		System.out.println(hs2);
	
		return hs1.equals(hs2);
	}
	
	public static boolean checkArrayUsingSort(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,3,4,5};
		int b[]= {2,1,3,5,3,4};
		
		System.out.println(checkArrayUsingMap(a,b));
		//t(n)= n; s(n)= n;
		
		System.out.println(checkArrayUsingSort(a,b));
		//t(n)= n(log n); s(n)= 1;
		
	}

}
