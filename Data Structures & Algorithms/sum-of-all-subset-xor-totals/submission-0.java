class Solution {
    public int xor(int[] nums,int total,int i)
    {
        if(i==nums.length)
        {
            return total;
        }
    int x=xor(nums,total^nums[i],i+1);
    int y=xor(nums,total,i+1);
    return x+y;

    }
    public int subsetXORSum(int[] nums) {
        int total=0;
         return xor(nums,total,0);
        
    }
}