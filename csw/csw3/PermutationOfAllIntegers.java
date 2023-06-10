
public class PermutationOfAllIntegers {

	public static int count=0;
	public static void permutation(int a[], int i) {
		int n=a.length;
		if(i==n) {
			count++;
			printArr(a);
			return ;
		}
		
		for(int j=i;j<a.length;j++) {
			swap(a,i,j);
			permutation(a,i+1);
			swap(a,i,j);
			
		}
	}
	
	public static void swap(int a[], int i, int j) {
		int temp= a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void printArr(int a[]) {
		for(int e:a) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,9,3};
		permutation(a,0);
		System.out.println("Total count:"+ count);
	}

}
