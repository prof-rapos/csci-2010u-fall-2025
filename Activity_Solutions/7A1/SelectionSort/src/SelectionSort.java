import java.util.Arrays;

public class SelectionSort {

  public static int[] selectionSort(int[] arr) {
    int n = arr.length;

    for(int i = 0; i < arr.length; i++) {
      int minIndex = i;

      // Find the minimum element in the unsorted part
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]){
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

  public static void main(String[] args) {
    int[] arr = new int[]{2, 4, 6, 8, 1, 3, 5, 7};
    System.out.println(Arrays.toString(selectionSort(arr)));
  }
}