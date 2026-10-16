class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            int target=0-nums[i];
            while(j<k)
            {
                List<Integer> temp=new ArrayList<>();
               int sum=nums[j]+nums[k];
               if(sum>target)
               {
                  k--;
               }
               else if(sum<target)
               {
                j++;
               }
               else
               {
              temp.add(nums[i]);
               temp.add(nums[j]);
               temp.add(nums[k]);
               result.add(temp);
               j++;
               k--;
               }
            }
            
        }
        Set<List<Integer>> set = new HashSet<>(result);
        List<List<Integer>> result1 = new ArrayList<>(set);
        return result1;
    }
}