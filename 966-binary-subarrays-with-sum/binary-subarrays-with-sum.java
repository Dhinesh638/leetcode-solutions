class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        if(goal>0)
        {
        return binsubgoal(nums,goal)-binsubgoal(nums,goal-1);
        }
        return binsubgoal(nums,goal);
        
    }

    public int binsubgoal(int[] nums, int goal)
    {
        int a=nums.length;
        int left=0;
        int c=0;
        int sum=0;
        for(int i=0;i<a;i++)
        {
            sum=sum+nums[i];
            while(sum > goal)
            {
                sum=sum-nums[left];
                left++;
            }
            c=c+(i-left+1);
        }
        return c;
    }
}