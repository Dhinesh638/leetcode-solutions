class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int a=strs.length;
        int b=strs[0].length();
        String s="";
        for(int i=0;i<b;i++)
        {
            char ch=strs[0].charAt(i);
            int c=1;
            for(int j=1;j<a;j++)
            {
                if(i<strs[j].length())
                {
                char ch1=strs[j].charAt(i);
                if(ch==ch1)
                {
                    c++;
                }
                }
                else
                {
                    break;
                }
            }
            if(c==a)
            {
                s=s+ch;
            }
            else
            {
                break;
            }
        }
        return s;
    }
}