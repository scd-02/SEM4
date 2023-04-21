
public class SelectionSort {

	public static void selectionSort(int a []) {
		for(int i=0;i<a.length-1;i++) {
			int j,k;
			for(j=k=i;j<a.length;j++) {
				if(a[j]<a[k]) {
					k=j;
				}
			}
			swap(a,i,k);
		}
	}
	
	public static void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String[] args) {
		int a[]= {2,4,1,6,4,7,8,1};
		selectionSort(a);
		for(int e:a) {
			System.out.print(e+" ");
		}

	}

}
