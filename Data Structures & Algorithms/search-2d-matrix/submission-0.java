class Solution {
    public boolean Bs(int idx,int low,int high,int[][] arr,int target)
    {
        if(low>high) return false;
        int mid=low+(high-low)/2;
        if(arr[idx][mid]==target) return true;
        else if(arr[idx][mid]<target)
        {
            return Bs(idx,mid+1,high,arr,target);
        }
        else
        {
            return Bs(idx,low,mid-1,arr,target);
        }

    }
    public boolean searchMatrix(int[][] arr, int target) {
        int coln=arr[0].length-1;
        int low=0;
        for(int i=0;i<arr.length;i++)
        {
            if(target>= arr[i][0] && target<=arr[i][coln])
            {
                return Bs(i,low,coln,arr,target);
            }
        }
        return false;
    }
}