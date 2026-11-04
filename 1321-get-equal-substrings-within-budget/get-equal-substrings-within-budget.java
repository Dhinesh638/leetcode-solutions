class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int a=s.length();
        int left=0;
        int sum=0;
        int d=0;
        for(int i=0;i<a;i++)
        {
            sum=sum+Math.abs(s.charAt(i)-t.charAt(i));
            while(sum > maxCost)
            {
                sum=sum-Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            if(i-left+1 > d)
            {
                d=i-left+1;
            }
        }
        return d;
    }
}