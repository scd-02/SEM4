import java.util.HashSet;

public class Q1_FirstRepeatedEle {

	public static void firstRepEle(int a[]) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (hs.contains(a[i])) {
				System.out.println(a[i]);
				break;
			} else {
				hs.add(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 3, 2, 2 };
		firstRepEle(a);
	}

}
