public class BinarySearch {

  // t(n)= O(log n)
  public static int binarySearch(int a[], int key) {
    int l = 0, h = a.length - 1;
    while (l <= h) {
      int mid = (l + h) / 2;
      if (a[mid] == key)
        return mid;
      else if (a[mid] > key)
        h = mid - 1;
      else
        l = mid + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int a[] = { 2, 3, 4, 5, 6, 7, 8 };
    System.out.println(binarySearch(a, 6));
  }
}
