class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr=new int[position.length][2];
        Stack<Double> stack=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        double[] arrival=new double[speed.length];
        for(int i=0;i<arr.length;i++)
        { 
              arrival[i]=(double)(target-arr[i][0])/arr[i][1];
        }
        stack.push(arrival[0]);
        for(int i=1;i<arrival.length;i++)
        {
            if(stack.peek()<arrival[i])
            {
                stack.push(arrival[i]);
            }
        }

     return stack.size();
        
    }
}