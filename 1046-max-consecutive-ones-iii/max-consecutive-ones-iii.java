class Solution {
    public int longestOnes(int[] nums, int k) {

        int a=nums.length;
        int left=0;
        int max=0;
        int c=0;
        int[] arr=new int[1];
        for(int i=0;i<a;i++)
        {
            if(nums[i]==0)
            {
                arr[nums[i]]++;
                if(arr[nums[i]]>max)
                {
                    max=arr[nums[i]];
                }
                while(max > k)
                {
                    if(nums[left]==0)
                    {
                        max--;
                        arr[0]--;
                    }
                    left++;
                }
            }
            if(i-left+1 > c)
            {
                c=i-left+1;
            }
        }
    return c;
    }
}