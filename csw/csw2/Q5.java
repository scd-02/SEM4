import java.util.ArrayList;

public class Q5 {

	public static ArrayList<Integer> subArrSum(int a[], int sum) {
		ArrayList<Integer> list = new ArrayList<>();
		int tempSum = 0;
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			tempSum += a[i];
			if (tempSum > sum) {
				tempSum -= a[k];
				k++;
			}
			if (tempSum == sum) {
				list.add(k + 1);
				list.add(i + 1);
			}
		}
		if (list.isEmpty()) {
			list.add(-1);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 5, 3, 6, 4 };

		ArrayList<Integer> li = subArrSum(a, 6);
		for (Integer e : li) {
			System.out.print(e + " ");
		}
	}

}
