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
        allsubset(result,nums,i+1,curr);  
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        allsubset(result,nums,0,new ArrayList<>());
        return result;
        
    }
}
