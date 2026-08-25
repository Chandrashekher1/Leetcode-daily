class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int[] freq = new int[101];

        for (int i = 0; i < k; i++) {
            freq[nums[i] + 50]++;
        }

        int index = 0;
        for (int right = k; ; right++) {
            int count = 0;
            int beauty = 0;

            for (int value = -50; value < 0; value++) {

                count += freq[value + 50];

                if (count >= x) {
                    beauty = value;
                    break;
                }
            }

            ans[index++] = beauty;

            if (right == n) {
                break;
            }
            freq[nums[right - k] + 50]--;
            freq[nums[right] + 50]++;
        }

        return ans;
    }
}