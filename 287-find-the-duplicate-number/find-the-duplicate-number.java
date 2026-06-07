class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicate = new HashMap<>();


        for(int i =0; i<nums.length; i++) {
            if(!duplicate.containsKey(nums[i])){
                duplicate.put(nums[i],i+1);
            }
            else{
                return nums[i];
            }
        }   
    return -1;

    }
}