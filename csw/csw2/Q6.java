
public class Q6 {

	public static int missingNo(int a[], int n) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		
		return ((n*(n+1))/2) - sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,4,5};
		int n=5;
		System.out.println(missingNo(a,n));
	}

}
