import java.util.HashMap;
import java.util.Map;

public class Q2_PrintDupEle {

	public static void printDupEle(int a[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}else {
				hm.put(a[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> e:hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.print(e.getKey()+" ");
			}
		}
	}

	public static void main(String[] args) {
		int[] first = { 34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
		printDupEle(first);
	}

}
