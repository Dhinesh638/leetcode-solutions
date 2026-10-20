class Solution {
    public int pivotIndex(int[] nums) {
        
        int a=nums.length;
        int sum=0;
        int left=0;
        int right=0;
        for(int i=0;i<a;i++)
        {
            sum=sum+nums[i];
        }
        for(int i=0;i<a;i++)
        {
            right=sum-left-nums[i];
            if(left==right)
            {
                return i;
            }
            left=left+nums[i];
        }
        return -1;
    }
}