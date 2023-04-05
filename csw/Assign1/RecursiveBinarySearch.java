public class RecursiveBinarySearch {

  public static int recBinarySearch(int a[], int l, int h, int key) {
    while (l <= h) {
      int mid = (l + h) / 2;
      if (a[mid] == key)
        return mid;
      else if (a[mid] > key)
        return recBinarySearch(a, l, mid - 1, key);
      else
        return recBinarySearch(a, mid + 1, h, key);
    }
    return -1;
  }

  public static void main(String[] args) {
    int a[]= {1,2,3,6,7,9,14};
    System.out.println(recBinarySearch(a, 0, a.length-1, 1));
  }
}
