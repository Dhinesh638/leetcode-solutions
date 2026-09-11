class Solution {
    public String removeOuterParentheses(String s) {

       StringBuilder arr=new StringBuilder(s);
       int b=0,c=0;
       for(int i=0;i<arr.length();i++)
       {
        if(arr.charAt(i)=='(')
        {
            c++;
        }
        else
        {
            c--;
        }
        if(c==0)
        {
            arr.deleteCharAt(i);
            i--;
            arr.deleteCharAt(b);
            i--;
            b=i+1;
        }
       }
       return arr.toString();
    }
}