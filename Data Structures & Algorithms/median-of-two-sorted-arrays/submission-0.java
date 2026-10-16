class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            result[i]=nums1[i];
        }
        int k=0;
        for(int i=nums1.length;i<nums1.length+nums2.length;i++)
        {
         result[i]=nums2[k];
         k++;  
        }
        Arrays.sort(result);
        if((result.length)%2==0)
        {
            int q=result.length/2;
           double r=(result[q]+result[q-1])/2.0;
            return r;
        }
        else
        {
            int a=(int)result.length/2;
            return result[a];
        }
    }
}