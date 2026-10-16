class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
         int[] result=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            int cons=target-nums[i];
            if(map.containsKey(cons))
            {
              int ind=map.get(cons);
              result[0]=ind;
              result[1]=i;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
       
        return result;
        
    }
}
