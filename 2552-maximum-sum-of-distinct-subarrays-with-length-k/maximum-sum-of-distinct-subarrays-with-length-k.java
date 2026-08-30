class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        long windowSum = 0;
        long maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        if (freq.size() == k) {
            maxSum = windowSum;
        }

        for (int i = k; i < nums.length; i++) {

            int outgoing = nums[i - k];

            windowSum -= outgoing;

            freq.put(outgoing, freq.get(outgoing) - 1);

            if (freq.get(outgoing) == 0) {
                freq.remove(outgoing);
            }

            int incoming = nums[i];

            windowSum += incoming;

            freq.put(incoming, freq.getOrDefault(incoming, 0) + 1);

            if (freq.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}