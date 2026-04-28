class Solution {
    public int maxDepth(String s) {
        int current = 0;
        int max = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                current++;
                max = Math.max(current,max);
            }
            else if(ch == ')'){
                current--;
            }
        }

        return max;
    }
}