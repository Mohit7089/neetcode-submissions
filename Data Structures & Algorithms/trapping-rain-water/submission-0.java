class Solution {
    public int trap(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = Math.max(nums[i], prefix[i - 1]);
        }
        suffix[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = Math.max(nums[i], suffix[i + 1]);
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += Math.min(prefix[i], suffix[i]) - nums[i];
        }
        return result;
    }
}