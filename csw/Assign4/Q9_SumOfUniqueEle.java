import java.util.HashSet;
import java.util.Iterator;

public class Q9_SumOfUniqueEle {
	
	public static int sumOfUnique(int a[]) {
		int sum=0;
		HashSet<Integer> hs = new HashSet<>();
		for(int e:a) {
			hs.add(e);
		}
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			sum += it.next();
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,2,4,4,5,6,4,6,7,6,5,7};
		System.out.println(sumOfUnique(a));
	}

}
