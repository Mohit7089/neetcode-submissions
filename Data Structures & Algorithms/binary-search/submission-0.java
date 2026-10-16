class Solution {
    public int Bs(int low,int high,int[] nums,int target)
    {
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target)
        {
            return Bs(mid+1,high,nums,target);
        }
        else
        {
            return Bs(low,mid-1,nums,target);
        }
    }
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        return Bs(low,high,nums,target);
        
    }
}
