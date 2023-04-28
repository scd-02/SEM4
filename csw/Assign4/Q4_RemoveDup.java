import java.util.HashSet;

public class Q4_RemoveDup {
	
	public static void removeDup(int a[]) {
		HashSet<Integer> hs = new HashSet<>();
		for(int e: a) {
			hs.add(e);
		}
		System.out.println(hs);
	}

	public static void main(String[] args) {
		int a[]= {2,1,3,3,14,2,6,29,24,33};
		removeDup(a);

	}

}
