class Solution {
    public void comb(List<List<Integer>> result,int[] nums,int sum,List<Integer> curr,int i,int target)
    {
        if(sum==target)
        {
            result.add(new ArrayList<>(curr));
            return;
        }
        if(sum>target) return;
        if(i==nums.length) return;
        curr.add(nums[i]);
        sum+=nums[i];
        comb(result,nums,sum,curr,i+1,target);
        curr.remove(curr.size() - 1);
        sum-=nums[i];
        comb(result,nums,sum,curr,i+1,target);

    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        int sum=0;
        comb(result,nums,sum,new ArrayList<>(),0,target);
        Set<List<Integer>> set=new HashSet<>(result);
        List<List<Integer>> list=new ArrayList<>(set);
        return list;

        
    }
}
