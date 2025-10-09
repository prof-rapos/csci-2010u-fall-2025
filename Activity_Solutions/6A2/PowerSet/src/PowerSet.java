import java.util.*;

public class PowerSet {
  public static void main(String[] args) {
    int[] nums = new int[]{1, 2, 3};
    List<List<Integer>> results = powerSet(nums);
    System.out.println(results);
    // Output: [[], [1], [2], [3],
    // [1, 2], [1, 3], [2, 3], [1, 2, 3]]
  }

  public static List<List<Integer>> powerSet(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(nums, 0, new ArrayList<>(), result);
    return result;
  }

  private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
    // Add a copy of the current subset to the result
    result.add(new ArrayList<>(current));

    // Explore further elements
    for (int i = start; i < nums.length; i++) {
      // Include nums[i]
      current.add(nums[i]);

      // Recurse with next index
      backtrack(nums, i + 1, current, result);

      // Backtrack: remove last element
      current.remove(current.size() - 1);
    }
  }

}