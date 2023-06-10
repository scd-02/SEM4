
public class TraversalInMatrtix {
	
	public static int upperTriangle(int a[][],int n) {
		int sum =0;
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>=i;j--) {
				sum += a[i][j];
			}
		}
		return sum;
	}
	
	public static int LowerTriangle(int a[][],int n) {
		int sum =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}
	
	public static int inverseUpperTriangle(int a[][],int n) {
		int sum =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-1-i;j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}
	
	public static int inverseLowerTriangle(int a[][],int n) {
		int sum =0;
		for(int i=0;i<n;i++) {
			for(int j=n-1-i;j<=n-1;j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int a[][]= {
				{1,2,3},
				{1,2,3},
				{1,2,3},
				};
		System.out.println(upperTriangle(a,3));
		System.out.println(LowerTriangle(a,3));
		System.out.println(inverseUpperTriangle(a,3));
		System.out.println(inverseLowerTriangle(a,3));
		}
		

	}


