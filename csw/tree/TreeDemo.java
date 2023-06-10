
public class TreeDemo {

	public static Node createBST(int a[]) {

		if (a.length == 0) {
			return null;
		}
		Node root = create(a, 0, a.length - 1);
		return root;
	}

	public static Node create(int a[], int s, int e) {

		if (s > e) {
			return null;
		}

		int mid = (s + e) / 2;
		Node root = new Node(a[mid]);
		root.left = create(a, s, mid - 1);
		root.right = create(a, mid + 1, e);

		return root;
	}

	public static void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static void preorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 7, 9, 11, 13, 15 };

//		creating a tree from sorted list
		Node root = createBST(arr);

//		inOrder, preOrder, postOrder traversal
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
	}

}
