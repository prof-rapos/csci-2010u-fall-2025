import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = new int[]{3, 5, 6, 4, 1, 2, 9, 8, 7, 10};
    printArray(arr);
    arr = selectionSort(arr);
    printArray(arr);
  }

  public static int[] selectionSort(int[] arr) {
    // TO-DO: sort the array
    int n = arr.length;
    int minIndex = 0;
    for (int i = 0; i< n; i++) {
      minIndex = i;

      // Find the minimum element in the unsorted part
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      // Swap the found minimum element
      if (minIndex != i) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
    }
    return arr;
  }
  public static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
