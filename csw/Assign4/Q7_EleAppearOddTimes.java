
public class Q7_EleAppearOddTimes {
	
	public static int eleAppOddTimes(int a[]) {
		int xor= 0;
		for(int i=0;i<a.length;i++) {
			xor ^= a[i];
		}
		return xor;
	}

	public static void main(String[] args) {
	
		int a[]= {2,2,4,5,6,4,6,7,5,5,7};
		System.out.println(eleAppOddTimes(a));
		
	}

}
