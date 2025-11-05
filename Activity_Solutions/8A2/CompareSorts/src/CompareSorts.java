public class CompareSorts {



  public static int[] getArray(int n, int scenario) {
    if (scenario == 0) { //Quick Sort Win
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = (int)(Math.random() * 10000) + 1;
      }
      arr[arr.length-1] = Integer.MAX_VALUE/3;
      return arr;
    } else if (scenario == 1) { //Merge Sort Win
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = i; // sorted
      }
      // introduce a few small random swaps (slightly unsorted)
      for (int i = 0; i < 1000; i++) {
        int a = (int)(Math.random() * n);
        int b = (int)(Math.random() * n);
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
      }
      arr[arr.length - 1] = Integer.MAX_VALUE / 3;
      return arr;
    } else { //Counting Sort Win
      int[] arr = new int[n];
      for(int i = 0; i < n; i+=2) {
        arr[i] = 1;
      }
      return arr;
    }
  }

  public static int findMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i : arr) {
      max = Math.max(max, i);
    }
    return max;
  }

  public static void main(String[] args) {


    int[] arr1;
    int[] arr2;
    int[] arr3;

    for (int i = 0; i < 3; i++) {
      System.out.print("Scenario #" + (i+1) + ": ");
      String type;
      switch (i) {
        case 0:
          type = "Quick";
          break;
        case 1:
          type = "Merge";
          break;
        default:
          type = "Counting";
      }
      System.out.println(type + " Sort is Fastest");
      int n = 1500000;
      int[] arr = getArray(n, i);

      arr1 = new int[n];
      arr2 = new int[n];
      arr3 = new int[n];
      int max = findMax(arr);
      System.arraycopy(arr,0,arr1,0, n);
      System.arraycopy(arr,0,arr2,0, n);
      System.arraycopy(arr,0,arr3,0, n);

      long start, end, dur;
      start = System.currentTimeMillis();
      QuickSort.quickSort(arr1, 0, n - 1);
      end = System.currentTimeMillis();
      dur = end - start;
      System.out.printf("%8s Sort on %d numbers took %5d ms%n", "Quick", n, dur);

      start = System.currentTimeMillis();
      MergeSort.mergeSort(arr2, 0, n - 1);
      end = System.currentTimeMillis();
      dur = end - start;
      System.out.printf("%8s Sort on %d numbers took %5d ms%n", "Merge", n, dur);

      start = System.currentTimeMillis();
      CountingSort.countingSort(arr3, max);
      end = System.currentTimeMillis();
      dur = end - start;
      System.out.printf("%8s Sort on %d numbers took %5d ms%n", "Counting", n, dur);

      System.out.println();

    }
  }
}