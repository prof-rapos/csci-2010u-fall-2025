import java.util.Arrays;

public class StringMergeSort {

  // Method to perform merge sort on an array
  public static void mergeSort(String[] array, int left, int right) {
    //if the array can be divided, divide, conquer, combine
    if (left < right) {
      int mid = (left + right) / 2;
      mergeSort(array, left, mid);
      mergeSort(array, mid+1, right);
      merge(array, left, mid, right);
    }
  }

  // Method to merge two halves of the array
  public static void merge(String[] array, int left, int mid, int right) {
    // Sizes of two subarrays to be merged
    int leftSize = mid - left + 1;
    int rightSize = right - mid;

    // Temporary arrays
    String leftArray[] = new String[leftSize];
    String rightArray[] = new String[rightSize];

    // Copy data to temp arrays
    for(int i = 0; i < leftSize; i++) {
      leftArray[i] = array[left+i];
    }
    for(int i = 0; i < rightSize; i++) {
      rightArray[i] = array[mid+i+1];
    }

    // Initial indexes of first and second subarrays
    int i = 0, j = 0;

    // Initial index of the merged subarray
    int k = left;

    // merge by taking smallest of two values
    while (i < leftSize && j < rightSize) {
      if (leftArray[i].compareTo(rightArray[j]) < 0) {
        array[k++] = leftArray[i++];
      } else {
        array[k++] = rightArray[j++];
      }
    }
    //take the rest of the left array
    while (i < leftSize) {
      array[k] = leftArray[i];
      i++;
      k++;
    }
    //take the rest of the right array
    while (j < rightSize) {
      array[k] = rightArray[j];
      k++;
      j++;
    }
  }

  public static void main(String[] args) {

    String[] arr = new String[] {"A", "C", "E", "G", "B", "D", "F"};
    mergeSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }
}