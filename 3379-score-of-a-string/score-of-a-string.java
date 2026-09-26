class Solution {
    public int scoreOfString(String s) {

        int a=s.length();
        HashMap<Integer,Character> arr=new HashMap<>();
        for(int i=0;i<a;i++)
        {
            char ch=s.charAt(i);
            arr.put(i,ch);
        }
        int b=0;
        for(int i=1;i<a;i++)
        {
            char ch=s.charAt(i);
            char ch1=s.charAt(i-1);
            b=b+Math.abs((int)(ch)-(int)(ch1));
        }
        return b;
    }
}