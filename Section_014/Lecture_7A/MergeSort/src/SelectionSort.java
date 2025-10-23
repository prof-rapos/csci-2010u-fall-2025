public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = new int[] {8,4,3,7,9,-7,23,55,67};
    printArray(arr);
    arr = insertionSort(arr);
    printArray(arr);
  }

  public static int[] insertionSort(int[] array) {

    int n = array.length;
    for (int i = 0; i < n; i++) {
      int minIndex = i;

      // Find the minimum element in the unsorted part
      for (int j = i+1; j < n; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }  // Swap the found minimum element
      if (minIndex != i) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }


    }
    return array;

  }

  public static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }


}
