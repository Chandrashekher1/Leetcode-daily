import java.util.Arrays;

class Solution {
    int[][] dp;

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        dp = new int[n][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, -1, nums);
    }

    private int solve(int i, int prev, int[] nums) {

        if (i == nums.length) {
            return 0;
        }

        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        int skip = solve(i + 1, prev, nums);

        int take = 0;

        if (prev == -1 || nums[i] > nums[prev]) {
            take = 1 + solve(i + 1, i, nums);
        }

        dp[i][prev + 1] = Math.max(take, skip);

        return dp[i][prev + 1];
    }
}