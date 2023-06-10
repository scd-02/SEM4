import java.util.ArrayList;

public class Heap {

	public static void buildMaxHeap(ArrayList<Integer> list) {

		for (int i = (int) Math.floor(list.size() / 2); i >= 0; i--) {
			maxHeapify(list, i);
		}
	}

	public static void buildMinHeap(ArrayList<Integer> list) {

		for (int i = (int) Math.floor(list.size() / 2); i >= 0; i--) {
			minHeapify(list, i);
		}
	}

	public static void maxHeapify(ArrayList<Integer> list, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		int largest = i;

		if (left < list.size() && list.get(i) < list.get(left)) {
			largest = left;
		}

		if (right < list.size() && list.get(largest) < list.get(right)) {
			largest = right;
		}

		if (largest != i) {
			swap(list, i, largest);
			maxHeapify(list, largest);
		}
	}

	public static void minHeapify(ArrayList<Integer> list, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		int smallest = 0;

		if (left < list.size() && list.get(i) > list.get(left)) {
			smallest = left;
		}

		if (right < list.size() && list.get(smallest) > list.get(right)) {
			smallest = right;
		}

		if (smallest != i) {
			swap(list, i, smallest);
			minHeapify(list, smallest);
		}
	}

	public static void swap(ArrayList<Integer> list, int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public static void printHeap(ArrayList<Integer> list) {
		for(Integer e: list) {
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	public static boolean isMaxHeap(ArrayList<Integer> list) {
		
		for(int i = 0; i < (int)Math.floor(list.size()/2)-1; i++) {
			int left = 2*i+1;
			int right = 2*i+2;
			
			if(list.get(left)>list.get(i)|| list.get(right)> list.get(i))
				return false;
		}
		return true;
	}
	
public static boolean isMinHeap(ArrayList<Integer> list) {
		
		for(int i = 0; i < (int)Math.floor(list.size()/2)-1; i++) {
			int left = 2*i+1;
			int right = 2*i+2;
			
			if(list.get(left)<list.get(i)|| list.get(right)< list.get(i))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(15);
		list.add(30);
		list.add(8);
		list.add(10);
		list.add(16);
		list.add(50);
		list.add(20);
		list.add(60);
		
		buildMaxHeap(list);
		printHeap(list);
		
		System.out.println(isMinHeap(list));
	}

}
