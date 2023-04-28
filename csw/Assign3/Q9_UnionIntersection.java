import java.util.Arrays;

public class Q9_UnionIntersection {
  public static void unionInteresection(int a[], int b[]) {
    Arrays.sort(a);
    Arrays.sort(b);

    int[] union = new int[a.length + b.length];
    int[] intersection = new int[Math.min(a.length, b.length)];
    int uInd = 0, iInd = 0;
    int i = 0, j = 0;

    while (i < a.length && j < b.length) {
      if (a[i] == b[j]) {
        union[uInd++] = a[i++];
        intersection[iInd++] = b[j++];
      } else if (a[i] < b[j]) {
        union[uInd++] = a[i++];
      } else {
        union[uInd++] = b[j++];
      }
    }

    while (i < a.length) {
      union[uInd++] = a[i++];
    }
    while (j < b.length) {
      union[uInd++] = b[j++];
    }

    for (int k = 0; k < uInd; k++)
      System.out.print(union[k] + " ");
    System.out.println();
    for (int k = 0; k < iInd; k++)
      System.out.print(intersection[k] + " ");

  }

  public static void main(String[] args) {
    int arr1[] = { 1, 11, 2, 3, 14, 5, 6, 8, 9 };
    int arr2[] = { 2, 4, 5, 12, 7, 8, 13, 10 };
    unionInteresection(arr1, arr2);
  }
}
