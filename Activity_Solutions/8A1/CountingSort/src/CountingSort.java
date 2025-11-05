public class CountingSort {
  public static int findMin(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int i : arr) {
      min = Math.min(min,i);
    }
    return min;
  }
  public static void shiftArray(int[] arr, int shift) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] -= shift;
    }
  }
  // Stable Counting Sort with max value as parameter, adjusted to account for negative values
  public static void countingSort(int[] arr, int maxValue) {
    int min = findMin(arr);
    shiftArray(arr, min);
    maxValue-=min;
    // create a count array and sorted array
    int[] count = new int[maxValue+1];
    int[] sorted = new int[arr.length];

    // Step 1: Store the count of each element
    for (int i : arr) {
      count[i]++;
    }

    // Step 2: Calculate the running total (cumulative count)
    for(int i = 1; i <= maxValue; i++) {
      count[i] += count[i-1];
    }
    // Step 3: Build the sorted array in reverse for stability
    for(int i = arr.length-1; i >=0; i--) {
      //3a: get value to insert
      int val = arr[i];
      //3b: reduce counter
      count[val]--;
      //3c: get index to place value from reduced counter
      int index = count[val];
      //3d: insert value at sorted index
      sorted[index] = val;
    }
    shiftArray(sorted, -min);
    // Step 4: Copy sorted array back to original array (hint: System.arraycopy(src, ind, target, ind, len)
    System.arraycopy(sorted,0,arr,0,arr.length);
  }

  // Test method
  public static void main(String[] args) {
    int[] arr = {0, 5, 8, -8, 65, 34, 12, 32, -100};

    System.out.println("Original array:");
    printArray(arr);
    System.out.println("Sorted array:");
    countingSort(arr, 65);

    printArray(arr);


  }

  // Helper method to print an array
  private static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}