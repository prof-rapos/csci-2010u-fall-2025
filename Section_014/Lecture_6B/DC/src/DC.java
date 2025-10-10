public class DC {
  public static void main(String[] args) {

    int[] nums = new int[]{5,8,34,222,-5,0,138,36};
    System.out.println(minElement(nums,0,nums.length-1));
  }

  public static int minElement(int[] nums, int low, int high) {
    if (low == high) {
      return nums[low];
    } else {
      int midpoint = (low + high) / 2;
      return Math.min(minElement(nums, low, midpoint),
          minElement(nums, midpoint+1, high));
    }

  }
}