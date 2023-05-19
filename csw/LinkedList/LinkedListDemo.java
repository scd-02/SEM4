//import java.util.LinkedList;
//import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class LinkedListDemo {

	public static Node insertBeg(Node root, int data) {
		Node newNode = new Node(data);
		if (root == null) {
			return newNode;
		}

		newNode.next = root;
		root = newNode;
		return root;
	}

	public static Node insertBet(Node root, int data, int index) {
		Node newNode = new Node(data);
		int size = size(root);
		if (size == 0) {
			return insertBeg(root, data);
		} else if (size + 1 == index) {
			return insertEnd(root, data);
		} else {
			int i = 1;
			Node curr = root;
			while (curr.next != null && i < index - 1) {
				curr = curr.next;
				i++;
			}
			newNode.next = curr.next;
			curr.next = newNode;
		}
		return root;
	}

	public static Node insertEnd(Node root, int data) {
		Node newNode = new Node(data);
		if (root == null) {
			return newNode;
		}
		Node curr = root;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
		return root;
	}

	public static Node insertInSortedWay(Node root, int data) {
		Node newNode = new Node(data);
		Node curr = root;

		if (root == null || curr.next.data <= data) {
			newNode.next = root;
			root = newNode;
			return root;
		}

		while (curr.next != null && curr.next.data <= data) {
			curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		return root;
	}

	public static Node reverse(Node root) {
		if (root == null) {
			return null;
		}

		Node p = null, q = root, r = root;

		while (q != null) {
			r = q.next;
			q.next = p;
			p = q;
			q = r;
		}

		root = p;
		return root;

	}

	public static Node recReverseLinkedList(Node currNode, Node prevNode) {
		if (currNode == null) {
			return null;
		}

		if (currNode.next == null) {
			currNode.next = prevNode;
			return currNode;
		}

		Node rev = recReverseLinkedList(currNode.next, currNode);
		currNode.next = prevNode;
		return rev;
	}

	public static void display(Node root) {
		Node temp = root;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static Node sort(Node root) {

		if (root == null) {
			return null;
		}

		int size = size(root);
		if (size == 1) {
			return root;
		}

		int n = size;
		for (int i = 0; i < size - 1; i++) {
			Node p = root, q = root;
			while (p.next != null && n == size - i) {
				q = p.next;
				if (p.data > q.data) {
					int temp = p.data;
					p.data = q.data;
					q.data = temp;
				}
				p = q;
			}
			n--;
		}
		return root;
	}

	public static int size(Node root) {
		if (root == null) {
			return 0;
		}
		int size = 0;
		Node temp = root;
		while (temp != null) {
			size++;
			temp = temp.next;
		}

		return size;
	}

	public static Node deleteBeg(Node root) {
		if (root == null) {
			System.out.println("No node exists.");
			return null;
		}

		root = root.next;
		return root;
	}

	public static Node deleteBetw(Node root, int index) {
		int size = size(root);
		if (size == 0 || index > size) {
			System.out.println("No element exists.");
			return null;
		} else if (size == index) {
			return deleteEnd(root);
		} else {
			int i = 1;
			Node curr = root;
			while (curr.next != null && i < index - 1) {
				curr = curr.next;
				i++;
			}
			curr.next = curr.next.next;
		}

		return root;
	}

	public static Node deleteEnd(Node root) {
		if (root == null) {
			System.out.println("No node exists.");
			return null;
		}

		Node curr = root;
		while (curr.next.next != null) {
			curr = curr.next;
		}

		curr.next = null;
		return root;
	}

	public static Node removeDup(Node root, int val) {
		if (root == null) {
			System.out.println("No element exists.");
			return null;
		}

		Node curr = root;
		while (curr != null && curr.data == val) {
			root = root.next;
			curr = root;
		}

		while (curr != null) {
			Node nextNode = curr.next;
			if (nextNode != null && nextNode.data == val) {
				curr.next = nextNode.next;
			} else {
				curr = nextNode;
			}
		}
		return root;
	}

	public static boolean search(Node root, int data) {
		Node curr = root;
		while (curr != null) {
			if (curr.data == data) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	public static boolean isEmpty(Node root) {
		return (root == null);
	}

	public static Node deleteList(Node root) {
		root = null;
		return root;
	}

	public static Node copyListReverse(Node root) {
		Node newNode = null;
		Node prev = null;
		Node curr = root;
		while (curr != null) {
			newNode = new Node(curr.data);
			newNode.next = prev;
			prev = newNode;
			curr = curr.next;
		}
		return prev;
	}

	public static Node copyList(Node root) {
		Node curr = root;
		if (curr == null) {
			return null;
		}
		Node head = null;
		Node prev = null;
		Node newNode = null;

		head = new Node(root.data);
		prev = head;
		curr = curr.next;
		while (curr != null) {
			newNode = new Node(curr.data);
			prev.next = newNode;
			prev = newNode;
			curr = curr.next;
		}
		return head;
	}

	public static boolean compareList(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;
		else if (root1 == null || root2 == null || root1.data != root2.data)
			return false;
		else
			return compareList(root1.next, root2.next);
	}

	public static boolean loopDetect(Node root) {
		if (root == null) {
			return false;
		}
		Node fastPointer = root;
		Node slowPointer = root;

		while (fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer) {
				return true;
			}
		}
		return false;
	}

	public static Node loopPointDetect(Node root) {
		if (root == null) {
			return null;
		}
		Node fastPointer = root;
		Node slowPointer = root;

		while (fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer) {
				return slowPointer;
			}
		}
		return null;
	}

	public static Node loopRemove(Node root) {
		Node loopPoint = loopPointDetect(root);
		if (loopPoint == null) {
			return null;
		}

		Node firstPointer = root;
		if (loopPoint == root) {
			while(firstPointer.next != root) {
				firstPointer= firstPointer.next;
			}
			firstPointer = null;
		}
		
		Node secondPointer = loopPoint;
		while(firstPointer.next != secondPointer.next) {
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next;
		}
		secondPointer.next = null;
		
		return root;
	}

	public static void main(String[] args) {

		Node root = new Node(12);
		root.next = new Node(3);
		root.next.next = new Node(11);
		root.next.next.next = new Node(8);

//		Initial LinkedList
		System.out.print("Intial LinkedList: ");
		display(root);
		System.out.println();

//		Size
		System.out.println("Size: " + size(root));

//		Insertion
		root = insertBeg(root, 14);
		root = insertEnd(root, 6);
		root = insertBet(root, 10, 3);
		System.out.print("After insertion: ");
		display(root);
		System.out.println();

//		Deletion
		root = deleteBeg(root);
		root = deleteEnd(root);
		root = deleteBetw(root, 4);
		System.out.print("After Deletion: ");
		display(root);
		System.out.println();

//		Reverse
		System.out.print("Reversed: ");
		root = reverse(root);
		display(root);
		System.out.println();

//		Recursive Reverse
		System.out.print("Reversed Recursively: ");
		root = recReverseLinkedList(root, null);
		display(root);
		System.out.println();

//		sorting
		System.out.print("Sorted: ");
		root = sort(root);
		display(root);
		System.out.println();

//		Insertion in sorted position
		System.out.print("Inserting in sorted Way: ");
		root = insertInSortedWay(root, 9);
		display(root);
		System.out.println();

//		Remove duplicates of given no
		Node remoDup = null;
		remoDup = insertBeg(remoDup, 2);
		remoDup = insertEnd(remoDup, 2);
		remoDup = insertEnd(remoDup, 3);
		remoDup = insertEnd(remoDup, 4);
		remoDup = insertEnd(remoDup, 2);
		remoDup = insertEnd(remoDup, 2);
		remoDup = insertEnd(remoDup, 5);
		remoDup = insertEnd(remoDup, 2);
		remoDup = insertEnd(remoDup, 2);
		System.out.print("Initial LinkedList: ");
		display(remoDup);
		System.out.println();

		remoDup = removeDup(remoDup, 2);
		System.out.print("Removed duplicate Appreance: ");
		display(remoDup);
		System.out.println();

//		search
		System.out.println("If given element is present: " + search(root, 8));

//		isEmpty
		System.out.println("If LinkedList is empty: " + isEmpty(root));

//		copyReverseList
		Node newRevList = copyListReverse(root);
		System.out.print("Copy of LinkedList in reversed way: ");
		display(newRevList);
		System.out.println();
		System.out.print("Original List: ");
		display(root);
		System.out.println();

//		Copy List
		Node copyList = copyList(root);
		System.out.print("Copied List: ");
		display(copyList);
		System.out.println();
		System.out.print("Original List: ");
		display(root);
		System.out.println();

//		Compare List
		System.out.print("List 1: ");
		display(root);
		System.out.println();
		System.out.print("List 2: ");
		display(copyList);
		System.out.println();
		System.out.println("List 1 and 2 are same? " + compareList(root, copyList));

//		Loop detect
		Node loopList = new Node(2);
		loopList.next = new Node(3);
		loopList.next.next = new Node(6);
		loopList.next.next.next = new Node(5);
		loopList.next.next.next.next = loopList.next.next;

		System.out.println("Is there any loop present: " + loopDetect(loopList));
		
//		Remove Loop
		loopList = loopRemove(loopList);
		System.out.println("Is there any loop present: " + loopDetect(loopList));
		

//		Odd increasing and even decreasing

		/*
		 * LikedList contain duplicate elements; non synchronized; maintains insertion;
		 * order manipulation is fast; can be used as list, stack, queue; it uses double
		 * linked list to store elements
		 */

//		LinkedList<Integer> ll = new LinkedList<>();
//
//		Scanner sc = new Scanner(System.in);
//		boolean entry = true;
//		while (entry) {
//			System.out.println("Enter integer value:");
//			int value = sc.nextInt();
//			sc.nextLine();
//			insert(ll, value);
//			System.out.println("Want to enter more: y/n");
//			String s = sc.next();
//			if (s.equals("n") || s.equals("N")) {
//				entry = false;
//			}
//		}
//
//		sc.close();

	}

}
