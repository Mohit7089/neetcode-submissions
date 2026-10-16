class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack=new Stack<>();
        int[] ngl=new int[temp.length];
        int count=0;
        for(int i=temp.length-1;i>=0;i--)
        { 
            while(!stack.isEmpty() && temp[stack.peek()]<=temp[i])
            {
                 stack.pop();
               
            }
            ngl[i]=stack.isEmpty()? 0:stack.peek()-i;
            stack.push(i);
        }
        return ngl;
    }
}