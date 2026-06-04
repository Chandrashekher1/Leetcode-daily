class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        // For string 1 ;
        for(char ch : s.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch,0)+1);
        }

        // For string 2

        for(char ch : t.toCharArray()){
            if(!charCount.containsKey(ch)){
                return false;
            }
            charCount.put(ch, charCount.get(ch) -1);

            // check if counts are zero or not if no false
            if(charCount.get(ch) < 0){
                return false;
            }
        }
        return true;
    }
}