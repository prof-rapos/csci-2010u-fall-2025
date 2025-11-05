import java.util.Arrays;

public class QuickSort {
  public static void quickSort(int[] arr, int left, int right) {
    // make sure there is something still to sort (not a single element)
    if (left < right) {
      // partition the array
      int pivot = partition(arr,left,right);

      //recursively sort two partitions
      quickSort(arr, left, pivot-1);
      quickSort(arr, pivot+1, right);
    }
  }


  public static int partition(int[] arr, int left, int right) {
    //MODIFICATION 1: Use a random value as the pivot, then swap to the left so remainder of search is unchanged
    int rand = (int)(Math.random() * (right-left)) + left;
    swap(arr, left, rand);
    int pivot = arr[left];

    // Start from the element right after the pivot
    int i = left+1;
    // Start from the end of the array
    int j = right;

    // while there are still values left to compare
    while (i <= j) {
      // Move i to the right until we find an element less than or equal to the pivot MODIFICATION 2: Reverse Sort
      while (i <= j && arr[i] > pivot) {
        i++;
      }
      // Move j to the left until we find an element greater than or equal to the pivot MODIFICATION 2: Reverse Sort
      while (i <= j && arr[j] < pivot) {
        j--;
      }
      // If i is still less than or equal to j, we need to swap the out-of-place elements and advance the pointers
      if (i <= j) {
        swap(arr, i, j);
        i++;
        j--;
      }
    }
    // Move the pivot to its final place
    swap(arr,left, j);
    // Return the final position of the pivot
    return j;
  }

  // Utility function to swap two elements in an array
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void main(String[] args) {
    int[] arr = new int[] {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
    quickSort(arr,0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }
}