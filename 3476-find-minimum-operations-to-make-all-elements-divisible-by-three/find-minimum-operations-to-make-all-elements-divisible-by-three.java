class Solution {
    public int minimumOperations(int[] nums) {

        int a=nums.length;
        int c=0;
        for(int i=0;i<a;i++)
        {
            int b=nums[i]%3;
            if(b!=0)
            {
                    c++;
            }
        }
    return c;
    }
}