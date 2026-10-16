class Solution {
    public int maxProfit(int[] prices) {
       int max=0;
       int prc=prices[0];
       for(int i=1;i<prices.length;i++)
       {
         if(prices[i]<prc)
         {
            prc=prices[i];
         } 
         else
         {
            max=Math.max(max,prices[i]-prc);
         }
       }
       return max; 
    }
}
