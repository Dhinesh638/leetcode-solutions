class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int a=nums.length;
        int b=0;
        for(int i=0;i<k;i++)
        {
            b=b+nums[i];
        }
        int c=b;
        for(int i=k;i<a;i++)
        {
            b=b-nums[i-k];
            b=b+nums[i];
            if(b>c)
            {
                c=b;
            }
        }
        double d=(double)c/k;
        return d;
        
    }
}