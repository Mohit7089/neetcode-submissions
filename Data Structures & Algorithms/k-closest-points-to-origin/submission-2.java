class Solution {
    public int[][] kClosest(int[][] nums, int k) {
        PriorityQueue<Double> min=new PriorityQueue<>();
        int[][] result=new int[k][2];
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i][0];
            int y=nums[i][1];
            min.add(Math.sqrt(x*x+y*y));
        }
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                int x=nums[j][0];
                int y=nums[j][1];
                if(min.peek()==Math.sqrt(x*x+y*y) && idx<k)
                {
                    result[idx][0]=x;
                    result[idx][1]=y;
                    idx++;
                    nums[j][0]=Integer.MAX_VALUE;
                    nums[j][1]=Integer.MAX_VALUE;
                    min.poll();
                    break;
                }
            }
        }
        
     return result;
    }
}
