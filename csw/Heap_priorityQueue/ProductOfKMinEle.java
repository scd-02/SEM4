import java.util.PriorityQueue;

public class ProductOfKMinEle {
	
	public static int productOfKMin(int a[], int k) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=0;i<a.length;i++) {
			q.add(a[i]);
		}
		
		int product = 1;
		
		for(int j=0;j<k;j++) {
			product *= q.poll();
		}
		
		return product;
	}

	public static void main(String[] args) {
		
		int a[] = {2,5,1,6,7};
		System.out.println(productOfKMin(a, 4));
	}

}
