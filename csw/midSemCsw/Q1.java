import java.util.HashSet;

public class Q1 {
	public static class ArrayApp {
		public static int sumOfTwoArr(int a[], int b[]) {
			int maxSum = 0;
			int sum1 = 0, sum2 = 0;
			int i = 0, j = 0;

			while (i < a.length && j < b.length) {
				if (a[i] < b[j]) {
					sum1 += a[i++];
				} else if (b[j] < a[i]) {
					sum2 += b[j++];
				} else {
					maxSum += Math.max(sum1, sum2);
					maxSum += a[i];
					i++;
					j++;
					sum1 = 0;
					sum2 = 0;
				}
			}
			
			while(i<a.length) {
				sum1 += a[i++];
			}
			
			while(j<b.length) {
				sum2 += b[j++];
			}
			
			maxSum += Math.max(sum2, sum1);
			return maxSum;
		}
		
		public static int smallestPosMissNo(int a[]) {
			HashSet<Integer> hs = new HashSet<>();
			
			for(int i=0;i<a.length;i++) {
				hs.add(a[i]);
			}
			
			for(int i=1;i<a[a.length-1];i++) {
				if(!hs.contains(i)) {
					return i;
				}
			}
			return -1;
		}
		
		public static void hexaDec(int n) {
			String  s ="0123456789ABCDEF";
			if(n==0) {
				return ;
			}
			int digit = n%16;
			n = n/16;
			hexaDec(n);
			System.out.print(s.charAt(digit));
		}
		
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,7,8};
		int b[]= {4,5,8,9,10};
		System.out.println(ArrayApp.sumOfTwoArr(a, b));
		
		System.out.println(ArrayApp.smallestPosMissNo(a));
		ArrayApp.hexaDec(20);
	}

}
