class Solution {
    public int minPartitions(String n) {
       
       int a=n.length();
       int max=Integer.MIN_VALUE;
       for(int i=0;i<a;i++)
       {
        int b=n.charAt(i)-'0';
        if(b>max)
        {
            max=b;
        }
       }
       return max;
    }
}