class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxFre = 0;
        int ans = 0;
        for(int num: nums){
           if (freq.containsKey(num)){
                freq.put(num,freq.get(num) +1);
            }
            else {
                freq.put(num,1);
            }
        }

        for(int count : freq.values()){
            maxFre = Math.max(count, maxFre);
        }

        for(int count : freq.values()){
            if(count == maxFre){
                ans = ans + maxFre;
            }
        }

        return ans;
  }
}