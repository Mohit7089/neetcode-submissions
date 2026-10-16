class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        int resukt = 0;
        int[][] hash = new int[20000][2];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i] + 10000][0]++;
            hash[nums[i] + 10000][1] = nums[i];
        }
        Arrays.sort(hash, (a, b) -> b[0] - a[0]);
        for (int i = 0; i < k; i++) {
            result[i] = hash[i][1];
        }
        return result;
    }
}