import java.util.Arrays;

public class Q4 {

	public static void arrangeArr(int []a) {
		Arrays.sort(a);
		for(int i=0;i+2<a.length;i=i+2) {
			swap(a, i+1, i+2);
		}
	}
	
	public static void swap(int a[], int x, int y) {
		int temp =a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,5,6,3,2,4};
		
		arrangeArr(arr);
		for(int e:arr) {
			System.out.print(e+" ");
		}

	}

}
