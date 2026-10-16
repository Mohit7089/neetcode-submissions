class Solution {
    public void solve(int n, StringBuilder sb,int open,int close,List<String> str)
    {
        if(sb.length()==2*n)
        {
            str.add(sb.toString());
            return;
        }

        if(open<n)
        {
            sb.append('(');
            solve(n,sb,open+1,close,str);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open)
        {
            sb.append(')');
            solve(n,sb,open,close+1,str);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> str=new ArrayList<>();
        solve(n,new StringBuilder(),0,0,str);
        return str;
        

    
        
    }
}
