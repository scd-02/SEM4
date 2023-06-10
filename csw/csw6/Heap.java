import java.util.ArrayList;

public class Heap {

	public static void buildHeap(ArrayList<Integer> list) {
		for (int i = (int) Math.floor(list.size() / 2)-1; i >= 0; i--) {
			maxHeapify(list, i);
		}
	}

	public static void maxHeapify(ArrayList<Integer> list, int i) {

		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = 0;

		if (left <= list.size() - 1 && list.get(i) < list.get(left)) {
			largest = left;
		} else { 
			largest = i;
		}

		if (right <= list.size() - 1 && list.get(largest) < list.get(right)) {
			largest = right;
		}

		if (largest != i) {
			swap(list, largest, i);
			maxHeapify(list, largest);
		}

	}

	public static void swap(ArrayList<Integer> list, int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);

	}

	public static void printHeap(ArrayList<Integer> list) {
		for (Integer e : list) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void heapSort(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			buildHeap(list);
			swap(list, 0, i);
			System.out.print(list.remove(i) + " ");

		}
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

		System.out.println("Heap :");
		buildHeap(list);
		printHeap(list);
		System.out.println("Heap Sort:");
		heapSort(list);
		printHeap(list);
 

	}

}
