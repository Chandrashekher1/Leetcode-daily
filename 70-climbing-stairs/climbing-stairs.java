class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];

        Arrays.fill(dp,-1);

        return ways(n, dp);
    }

    int ways(int n, int[] dp){
        if(n <= 2){

            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = ways(n-1, dp) + ways(n-2,dp);

        return dp[n];
    }
}