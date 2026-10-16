class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        Set<Character> set=new HashSet<>();
        int x=0;
        for(int i=0;i<s.length();i++)
        {
             last[s.charAt(i) - 'a'] = i;
            char ch=s.charAt(i);
            if(!set.contains(ch)) x++;
            set.add(ch);
        }
        int[][] inter=new int[x][2];
        set.clear();
        int r=-1;
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
              if(!set.contains(ch))
              {
                  r++;   
                inter[r][0]=i;
                inter[r][1] = last[ch - 'a']; 
                 set.add(ch);
              }
  
        }
         Arrays.sort(inter, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> list = new ArrayList<>();
        int a = inter[0][0];
        int b = inter[0][1];
        for (int i = 0; i < inter.length - 1; i++) {
            if (b >= inter[i + 1][0]) {
                b = Math.max(b, inter[i + 1][1]);
            } else {
                list.add(new int[] { a, b });
                a = inter[i + 1][0];
                b = inter[i + 1][1];
            }
        }
        list.add(new int[] { a, b });
        int[][] arr = list.toArray(new int[list.size()][]);
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list1.add(arr[i][1]-arr[i][0]+1);
        }

        return list1;
    }
}
