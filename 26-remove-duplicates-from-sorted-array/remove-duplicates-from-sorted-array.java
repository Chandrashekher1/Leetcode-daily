class Solution {
    public int removeDuplicates(int[] nums) {
        // using 2 pointer

        int i=0;
        int j =1;

        while(j < nums.length){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}