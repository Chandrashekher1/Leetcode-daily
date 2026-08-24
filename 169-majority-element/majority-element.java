class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int arr : nums){
            freq.put(arr, freq.getOrDefault(arr,0)+1);
        }

        for(int num : freq.keySet()){
            if(freq.get(num) > nums.length/2){
                return num;
            }
        }
        return -1;
    }
}