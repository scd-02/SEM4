
public class Q1 {
	
	public static void reverseArrayWithK(int arr[], int k) {
		int i=0;
		while(i+k-1<arr.length) {
			reverse(arr, i ,i+k-1);
			i=i+k;
		}
		reverse(arr , i , arr.length-1);
	}
	
	public static void reverse(int arr[], int s, int e) {
		while(s<e) {
			int temp= arr[s];
			arr[s++]=arr[e];
			arr[e--]=temp;
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {1,5,3,3,5,7,6};
		int k=4;
		
		reverseArrayWithK(arr, k);
		for(int e:arr) {
			System.out.print(e+" ");
		}

	}

}
