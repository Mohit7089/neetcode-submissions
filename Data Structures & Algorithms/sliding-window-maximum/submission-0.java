class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result=new int[nums.length-k+1];
        result[0]=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(i>k-1)
            {
                int max=Integer.MIN_VALUE;
                int l=i-k+1;
                while(l<=i)
                {
                   max=Math.max(max,nums[l]);
                     l++;

                }
                result[i-k+1]=max;
            }
            else
            {
               result[0]=Math.max(result[0],nums[i]);
            }
            
        }
       return result;
        
    }
}