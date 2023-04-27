package assign3;

public class Q4_BringAllEleLessThanGivenVal {
	
	public static void eleLessThanGivenVal(int a[], int val) {
		int minSwap=0;
		int first=0;
		int second= a.length-1;
		
		while(first< second) {
			if(a[first]<val) {
				first++;
			}else if(a[second]>=val) {
				second--;
			}else {
				assign3.Main.swap(a, first, second--);
				minSwap++;
			}
		}
		
		System.out.println("Min Swap required: "+ minSwap);
		assign3.Main.display(a);
	}
	
}
