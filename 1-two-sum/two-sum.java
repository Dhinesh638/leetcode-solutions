class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
    int b=nums.length;
      for(int i=0;i<b;i++)
      {
        int a=0;
        for(int j=i+1;j<b;j++)
        {
            a=nums[i]+nums[j];
            if(a==target)
            {
                return new int[]{i,j};
            }
        }
      }  
    return new int[]{};
    }
}