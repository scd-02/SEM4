public class Q20_FindEleInBitonicLIst {
  public static int findMaxBitonicArr(int a[], int n) {
    if (n < 3)
      return -1;
    int start = 0, end = n - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
        return mid;
      } else if (a[mid] > a[mid - 1] && a[mid] < a[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

  public static int findEleBitonicList(int a[], int size, int k) {
    int max = findMaxBitonicArr(a, a.length);
    int ele = binarySearch(a, k, 0, max - 1);

    if (ele != -1)
      return ele;
    else {
      return binarySearch(a, k, max + 1, size - 1);
    }
  }

  public static int binarySearch(int a[], int k, int s, int e) {
    while (s <= e) {
      int mid = (s + e) / 2;
      if (a[mid] == k) {
        return mid;
      } else if (a[mid] < k) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 6, 7, 5, 4 };
    System.out.println(findEleBitonicList(a, a.length, 3));
  }
}
