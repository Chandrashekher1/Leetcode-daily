class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];

        Arrays.fill(memo, -1);

        int result = solve(coins, amount, memo);

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int solve(int[] coins, int amount, int[] memo) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        if (memo[amount] != -1) {
            return memo[amount];
        }
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = solve(coins, amount - coin, memo);
            if (result != Integer.MAX_VALUE) {
                minCoins = Math.min(minCoins, 1 + result);
            }
        }
        memo[amount] = minCoins;
        return memo[amount];
    }
}