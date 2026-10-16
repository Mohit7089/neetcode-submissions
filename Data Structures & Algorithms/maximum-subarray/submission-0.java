class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum - Math.abs(nums[i]) <= 0 && nums[i] > sum) {
                sum = nums[i];
            }
            max = Math.max(max, sum);

        }
        return max;
    }
}