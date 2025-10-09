public class Coins {
  public static void main(String[] args) {

    int[] coins = new int[]{5, 25, 100, 10, 200};
    System.out.println(minCoinChange(coins, 38500, new int[38501]));
  }

  public static int minCoinChange(int[] coins, int amount, int[] memo) {
    if (amount == 0) {
      return 0;
    }else if (memo[amount] != 0) {
      return memo[amount];
    } else {
      int min = Integer.MAX_VALUE;
      for (int coin : coins) {
        if (coin <= amount) {
          int coinAmount = 1 + minCoinChange(coins, amount - coin, memo);
          min = Math.min(min, coinAmount);
        }
      }
      memo[amount] = min;
      return min;
    }
  }
}