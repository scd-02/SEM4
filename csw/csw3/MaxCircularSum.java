
public class MaxCircularSum {
	
	public static int maxCirSum(int a[], int n) {
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int currSum=0;
			for(int j=0;j<n;j++) {
				int index = (i+j)%n;
				currSum += (j+1)*a[index];
			}
			maxSum = Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}
	
	public static int maxCirSum2(int a[], int n) {
		int maxval;
		int sumAll=0;
		int currval=0;
		
		for(int i=0;i<n;i++) {
			sumAll += a[i];
			currval +=(a[i]*(i+1));
		}
		
		maxval =currval;
		for(int i=1;i<n;i++) {
			currval = (currval + sumAll)-(n*a[n-i]);
			if(currval>maxval) {
				maxval= currval;
			}
		}
		
		return maxval;
	}

	public static void main(String[] args) {
		
		int a[]= {5,7,6,2,3};
		System.out.println(maxCirSum2(a,a.length));

	}

}
