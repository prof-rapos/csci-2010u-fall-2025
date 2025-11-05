public class MinElement {

  public static int findMin(int[] arr, int low, int high) {
    if (low == high) {
      return arr[low];
    }
    int mid = (low + high) / 2;
    int leftMax = findMin(arr, low, mid);
    int rightMax = findMin(arr, mid + 1, high);
    return Math.min(leftMax, rightMax);
  }



  public static void main(String[] args) {

    int[] arr = new int[]{2, 4, 6, 3, 5, 0, 1, -3};
    System.out.println(findMin(arr,0, arr.length-1));
  }
}