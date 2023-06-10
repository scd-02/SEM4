
public class IndexArr {

	public static void indexSortArr(int a[]) {
		for(int i=0;i<a.length;i++) {
			while(a[i]!=-1&& a[i]!=i) {
				swap(a,i,a[i]);
			}
		}
	}
	
	public static void swap(int a[], int x, int y) {
		int temp =a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	public static void main(String[] args) {
		int a[] = {2,3,-1,-1,4,-1,5};
		indexSortArr(a);
		for(int e:a) {
			System.out.print(e+" ");
		}

	}

}
