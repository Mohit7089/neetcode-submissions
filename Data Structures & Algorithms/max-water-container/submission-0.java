class Solution {
    public int maxArea(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int result = 0;
        while (i < j) {
            int length = Math.min(nums[i], nums[j]);
            int wid = j - i;
            int temp = length * wid;
            result = Math.max(temp, result);
            if (nums[i] >= nums[j]) {
                j--;
                
            }
            else{
            i++;
            }

        }
        return result;
    }
}