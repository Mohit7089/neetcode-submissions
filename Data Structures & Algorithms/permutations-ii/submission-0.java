class Solution {
    public void permu(int[] nums,List<List<Integer>> result, boolean[] freq,List<Integer> curr)
    { 
        if(curr.size()==nums.length)
        {
            result.add(new ArrayList<>(curr));
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                curr.add(nums[i]);
                permu(nums,result,freq,curr);
                curr.remove(curr.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        permu(nums,result,freq,new ArrayList<>());
        Set<List<Integer>> set = new HashSet<>(result);
        List<List<Integer>> list = new ArrayList<>(set);
        return list;

    }
}