import java.util.Arrays;

public class Q5_FindRangeBWMaxAndMin {
	
	public static void rangeBWMaxAndMin(int a[]) {
		Arrays.sort(a);
		int min = a[0];
		int max = a[a.length-1];
		System.out.println("Min:"+min+", Max:"+max);
		
		int val=min;
		int i=0;
		while(i<a.length) {
			if(val==a[i]) {
				val++;
				i++;
			}else {
				System.out.print(val+" ");
				val++;
			}
		}
	}

	public static void main(String[] args) {
		
		int a[]= {12,4,5,9,23,19};
		rangeBWMaxAndMin(a);
	
	}

}
