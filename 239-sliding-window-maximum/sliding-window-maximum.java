class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        int[] result = new int[nums.length-k+1];

        int resultIndex = 0;

        for(int i=0; i< nums.length; i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i] ){
                dq.pollLast();
            }

            dq.addLast(i);

            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            if(i >= k-1){
                result[resultIndex++] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}