class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int a=nums.length;
        int b=0;
        int c=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a;i++)
        {
            c=c+nums[i];
            while(c>=target)
            {
                int d=i-b+1;
                if(d<min)
                {
                    min=d;
                }
                c=c-nums[b];
                b++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}