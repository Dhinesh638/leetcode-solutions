class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int a=nums.length;
        int b=0;
        int c=1;
        int d=0;
        for(int i=0;i<a;i++)
        {
            c=c*nums[i];
            while(c>=k && b<=i)
            {
                c=c/nums[b];
                b++;
            }
            if(c<k)
            {
                d=d+(i-b+1);
            }
        }
        return d;
        
    }
}