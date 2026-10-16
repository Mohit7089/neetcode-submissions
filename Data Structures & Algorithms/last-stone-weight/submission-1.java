class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            max.add(stones[i]);
        }
        while(max.size()!=1 )
        {
            int x=max.poll();
            int y=max.poll();
            if(x>=y) max.add(x-y);
        }
        return max.poll();
    }
}
