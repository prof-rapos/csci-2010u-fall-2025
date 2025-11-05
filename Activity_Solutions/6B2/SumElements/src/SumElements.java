public class SumElements {

  public static int sumElements(int[] arr, int low, int high) {
    if (high == low) {
      return arr[low];
    }
    int mid = (low + high) / 2;
    int leftSum = sumElements(arr, low, mid);
    int rightSum = sumElements(arr, mid+1, high);
    return leftSum + rightSum;
  }

  public static void main(String[] args) {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6};
    System.out.println(sumElements(arr, 0, arr.length-1));
  }
}