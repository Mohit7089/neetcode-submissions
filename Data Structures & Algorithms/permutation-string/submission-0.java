class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        String sort1=new String(arr);  
        for(int i=0;i<s2.length()-s1.length()+1;i++)
        {
            int r=i+s1.length()-1;
            int k=0;
            int l=i;
             char[] arr2=new char[s1.length()];
             while(l<=r)
             {
                arr2[k]=s2.charAt(l);
                k++;
                l++;
                
             }
            Arrays.sort(arr2);
            if(Arrays.equals(arr,arr2)) return true;
        }

        return false;
    }
}