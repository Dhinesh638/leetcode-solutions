class Solution {
    public int minOperations(int[] nums, int k) {
        
        int a=nums.length;
        int sum=0;
        for(int i=0;i<a;i++)
        {
            sum=sum+nums[i];
        }
        int b=sum%k;
        int d=0;
        if(b==0)
        {
            return 0;
        }
        else
        {
            int c=sum/k;
            int target=c*k;
            d=sum-target;
        }
        return d;
    }
}