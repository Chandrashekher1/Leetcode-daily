class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> two_sum = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            int complement = target - nums[i];

            if(two_sum.containsKey(complement)){
                return new int[] {two_sum.get(complement),i};
            }

            two_sum.put(nums[i],i);
        }

        return new int[]{};
    }
}