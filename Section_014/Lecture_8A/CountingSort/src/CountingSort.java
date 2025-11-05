import java.util.Arrays;

public class CountingSort {
  public static int findMin(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int i : arr) {
      min = Math.min(min,i);
    }
    return min;
  }

  public static void shift(int[] arr, int shift) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] -= shift;
    }
  }

  // Stable Counting Sort with max value as parameter
  public static void countingSort(int[] arr, int maxValue) {
    int minValue = findMin(arr);
    shift(arr,minValue);

    maxValue += -minValue;

    // create a count array and sorted array
    int[] count = new int[maxValue+1];
    int[] sorted = new int[arr.length];


    // Step 1: Store the count of each element
    for (int i : arr) {
      count[i]++;
    }
    // Step 2: Calculate the running total (cumulative count)
    for (int i = 1; i < count.length; i++) {
      count[i] += count[i-1];
    }
    // Step 3: Build the sorted array in reverse for stability
    for (int i = arr.length-1; i >= 0; i--) {
      //3a: get value to insert
      int value = arr[i];
      //3b: reduce counter
      count[value]--;
      //3c: get index to place value from reduced counter
      int index = count[value];
      //3d: insert value at sorted index
      sorted[index] = value;
    }
    shift(sorted, -minValue);
    // Step 4: Copy sorted array back to original array (hint: System.arraycopy(src,    ind, targ, ind, len)
    System.arraycopy(sorted,0,arr,0,arr.length);
  }
  // Test method
  public static void main(String[] args) {
    /*int[] arr = {4, -2, 3, -6, 5, 2, 4, 1, 3, 3, -3, 3, 3};
    int maxValue = 5;
    System.out.println("Original array:");
    printArray(arr);
    countingSort(arr, maxValue);
    System.out.println("Sorted array:");
    printArray(arr);*/
    int arr[] = new int[]{0, Integer.MAX_VALUE/3};
    long start = System.currentTimeMillis();
    countingSort(arr, Integer.MAX_VALUE/3);
    long end = System.currentTimeMillis();
    long dur = end - start;
    System.out.println("Counting sort on 2 elements took " + dur + "ms");
    int[] arr2 = new int[]{0, Integer.MAX_VALUE/3};
    start = System.currentTimeMillis();
    Arrays.sort(arr2);
    end = System.currentTimeMillis();
    dur = end - start;
    System.out.println("Quick sort on 2 elements took " + dur + "ms");
    System.out.println();

    int[] arr3 = new int[100000000];
    int[] arr4 = new int[100000000];

    for (int i = 0; i < arr3.length; i++) {
      arr3[i] = (int)(Math.random() * 6);
      arr4[i] = arr3[i];
    }
    start = System.currentTimeMillis();
    countingSort(arr3, 5);
    end = System.currentTimeMillis();
    dur = end - start;
    System.out.println("Counting sort sorted " + arr3.length + " elements in "
      + dur + " ms.");
    start = System.currentTimeMillis();
    Arrays.sort(arr4);
    end = System.currentTimeMillis();
    dur = end - start;
    System.out.println("Quick sort sorted " + arr3.length + " elements in "
        + dur + " ms.");
  }
  // Helper method to print an array
  private static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
