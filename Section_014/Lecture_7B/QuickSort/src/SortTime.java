public class SortTime {

  public static void main(String[] args) {

    int n = 80000000;
    System.out.println("N = " + n);
    int[] quick = new int[n];
    int[] merge = new int[n];
    for (int r = 1; r<= 5; r++){
      for (int i = 0; i < n; i++) {
        int rand = (int)(Math.random() * 1000) + 1;
        quick[i] = rand;
        merge[i] = rand;
      }


      System.out.println("Run " + r + ":");
      long start = System.currentTimeMillis();
      MergeSort.mergeSort(merge,0,merge.length-1);
      long end = System.currentTimeMillis();
      long dur = end - start;
      System.out.println("Merge Sort: " + dur + "ms");
      start = System.currentTimeMillis();
      QuickSort.quickSort(quick, 0, quick.length-1);
      end = System.currentTimeMillis();
      dur = end - start;
      System.out.println("Quick Sort: " + dur + "ms");
    }
  }
}
