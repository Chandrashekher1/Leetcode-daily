class Solution {

    public int getMoneyAmount(int n) {

        int[][] memo = new int[n + 1][n + 1];

        return solve(1, n, memo);
    }

    private int solve(int left, int right, int[][] memo) {

        if (left >= right)
            return 0;

        if (memo[left][right] != 0)
            return memo[left][right];

        int minCost = Integer.MAX_VALUE;

        for (int k = left; k <= right; k++) {
            int leftCost = solve(left, k - 1, memo);
            int rightCost = solve(k + 1, right, memo);
            int cost = k + Math.max(leftCost, rightCost);
            minCost = Math.min(minCost, cost);
        }

        memo[left][right] = minCost;

        return minCost;
    }
}