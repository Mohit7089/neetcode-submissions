class Solution {
    public void allsubset( List<List<Integer>> result,int[] nums,int i,List<Integer> curr)
    {
        if(i==nums.length)
        {
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        allsubset(result,nums,i+1,curr);
        curr.remove(curr.size()-1);
        int idx=i+1;
        while(idx<nums.length && nums[idx-1]==nums[idx])
        {
            idx++;
        }
        allsubset(result,nums,idx,curr);  
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        allsubset(result,nums,0,new ArrayList<>());
        return result;
        
        
    }
}