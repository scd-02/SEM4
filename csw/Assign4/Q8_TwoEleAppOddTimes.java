
public class Q8_TwoEleAppOddTimes {

	public static void twoEleOddTimes(int a[]) {
		int xor=0;
		int first =0, second =0;
		for(int i=0;i<a.length;i++) {
			xor ^= a[i];
		}
		
		int setbit = xor & ~(xor-1);
		
		for(int i=0;i<a.length;i++) {
			if((a[i]&setbit) !=0)
				first ^= a[i];
			else
				second ^=a[i];
		}
		
		System.out.println("Elements are:"+first+" "+second);
	}
	
	public static void main(String[] args) {
		
		int a[]= {2,2,4,4,5,6,4,6,7,6,5,7};
		twoEleOddTimes(a);
	}

}
