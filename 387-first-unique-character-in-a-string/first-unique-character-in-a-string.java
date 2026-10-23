class Solution {
    public int firstUniqChar(String s) {
        // using frequency array

        int[] freq = new int[26];

        for(int ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}