public class Coins {
  public static void main(String[] args) {

    int[] coins = new int[]{200, 100, 25, 10, 5};
    System.out.println(minCoinChange(coins, 345));
  }

  public static int minCoinChange(int[] coins, int amount) {
    // Base case: if amount is 0, no coins are needed
    if (amount == 0) {
      return 0;
    }

    // Initialize minimum coins to a large number
    int minCoins = Integer.MAX_VALUE;

    // Try every coin to find the minimum coins needed
    for (int coin : coins) {
      if (amount - coin >= 0) {
        // Recursively find the number of coins needed for the remaining amount
        int coinsForRemainingAmount = minCoinChange(coins, amount - coin);
        // Update the minimum coins if the current coin gives a better result
        minCoins = Math.min(minCoins, 1 + coinsForRemainingAmount);
      }
    }

    // Return the result
    return minCoins;
  }

}