
public class Q6_MissingEle {
	
	public static int missEle(int a[], int n) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return ((n*(n+1))/2) - sum;
	}

	public static void main(String[] args) {
		
		int a[]= {2,3,6,1,5,7,4,9};
		System.out.println(missEle(a,a.length+1));

	}

}
