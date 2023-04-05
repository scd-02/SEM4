public class MaxMInForm {

  // t(n)=O(n); s(n)=O(n)
  public static void maxMinForm1(int a[]) {
    int ans[] = new int[a.length];
    int j = a.length - 1, i = 0;
    for (int k = 0; k < a.length; k++) {
      if ((k & 1) == 0)
        ans[k] = a[j--];
      else
        ans[k] = a[i++];
    }
    for (int e : ans) {
      System.out.print(e + " ");
    }
  }

  // t(n)=O(n^2); s(n)=O(1)
  public static void maxMinForm2(int a[]) {
    for (int i = 0; i < a.length - 1; i++) {
      reverse(a, i, a.length - 1);
    }
    for (int e : a) {
      System.out.print(e + " ");
    }
  }

  public static void reverse(int a[], int s, int e) {
    while (s < e) {
      int temp = a[s];
      a[s++] = a[e];
      a[e--] = temp;
    }
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5, 6, 7 };
    maxMinForm1(a);
    System.out.println();
    maxMinForm2(a);
  }
}
