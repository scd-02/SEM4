package assign3;

public class Q2_0s1s2sSort {
	
	public static void sort0s1s2s(int a[]) {
		int j=-1, pos=0;
		int swap=0;
		
		for(int i=0;i<a.length;i++) {
			if(j == -1 && a[i] == 2) 
				j=i;
			if(j != -1 && a[i] != 2) {
				assign3.Main.swap(a, i, j);
				swap++;
				j++;
			}
		}
		pos = j;
		j=-1;
		for(int i=0;i<pos;i++) {
			if(j == -1 && a[i] == 1) 
				j=i;
			if(j != -1 && a[i] != 1) {
				assign3.Main.swap(a, i, j);
				swap++;
				j++;
			}
		}
		
		System.out.println("No of swaps: "+ swap);
		assign3.Main.display(a);
	}
	
}
