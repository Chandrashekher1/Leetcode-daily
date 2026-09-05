class Solution {
    public int fib(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return fibo(n,memo);
    }

    int fibo(int n, int[] memo){
        if(n <= 1){
            return n;
        }
        if(memo[n] != -1){
            return memo[n];
        }
        memo[n] = fibo(n-1, memo) + fibo(n-2, memo);
        return memo[n];
    }
}