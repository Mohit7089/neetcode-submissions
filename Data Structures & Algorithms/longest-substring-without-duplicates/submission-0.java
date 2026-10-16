class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int left=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            while(!set.add(s.charAt(i)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            max=Math.max(max,i-left+1);
        }
       return max; 
    }
}
