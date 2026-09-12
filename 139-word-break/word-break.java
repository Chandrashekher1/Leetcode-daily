class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return solve(s, set, 0, memo);
    }

    private boolean solve(String s, Set<String> set,int i,Boolean[] memo) {
        if (i == s.length())
            return true;

        if (memo[i] != null)
            return memo[i];

        for (int j = i + 1; j <= s.length(); j++) {
            String word = s.substring(i, j);
            if (set.contains(word) &&
                solve(s, set, j, memo)) {

                return memo[i] = true;
            }
        }

        return memo[i] = false;
    }
}