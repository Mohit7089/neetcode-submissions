class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] a=Arrays.copyOf(strs,strs.length);
        for(int i=0;i<strs.length;i++)
        {
            char[] ch=a[i].toCharArray();
            Arrays.sort(ch);
            a[i]=new String(ch);
        }
        HashMap<String,List<Integer>> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(!map.containsKey(a[i]))
            {
                map.put(a[i],new ArrayList<>());
            }
            map.get(a[i]).add(i);
        }
        List<List<Integer>> group = new ArrayList<>(map.values());
        List<List<String>> result=new ArrayList<>();
        for(int i=0;i<group.size();i++)
        {
            List<String> temp = new ArrayList<>();

           for (int j = 0; j < group.get(i).size(); j++) {

                int index = group.get(i).get(j);
                temp.add(strs[index]);
            }

                 result.add(temp);


        }
        
        return result;
    }
    
}
                                                                                            