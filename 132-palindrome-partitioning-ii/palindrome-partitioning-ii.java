class Solution {
    public int minCut(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);

        return solve(s, 0, memo);
    }

    private int solve(String s, int i, int[] memo){
        if(i == s.length()){
            return 0;
        }

        if(memo[i] != -1){
            return memo[i];
        }

        int minCuts = Integer.MAX_VALUE;

        for(int j=i; j < s.length(); j++){
            if(isPalindrome(s,i,j)){
                if(j == s.length() -1){
                    minCuts = 0;
                }
                else{
                    int cuts = 1 + solve(s, j+1, memo);
                    minCuts = Math.min(minCuts, cuts);
                }
            }
        }
        memo[i] = minCuts;
        return minCuts;
    }

    private boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}