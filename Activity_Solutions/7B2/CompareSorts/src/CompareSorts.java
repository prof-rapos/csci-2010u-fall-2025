public class CompareSorts {
  public static void main(String[] args) {

    int n = 100000000;
    int[] arr1 = new int[n];
    int[] arr2 = new int[n];

    for (int i = 0; i < n; i++) {
      int val = (int)(Math.random() * 10000) + 1;
      arr1[i] = val;
      arr2[i] = val;
    }

    long start, end, dur;
    start = System.currentTimeMillis();
    QuickSort.quickSort(arr1,0,arr1.length-1);
    end = System.currentTimeMillis();
    dur = end - start;
    System.out.println("Quick Sort on " + n + " numbers took " + dur + "ms");

    start = System.currentTimeMillis();
    MergeSort.mergeSort(arr1,0,arr1.length-1);
    end = System.currentTimeMillis();
    dur = end - start;
    System.out.println("Merge Sort on " + n + " numbers took " + dur + "ms");


  }
}