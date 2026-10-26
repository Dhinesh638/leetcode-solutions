class Solution {
    public int longestSubarray(int[] nums) {

        int a=nums.length;
        int b=0;
        int c=0;
        int[] arr=new int[1];
        for(int i=0;i<a;i++)
        {
            if(nums[i]==0)
            {
                while(arr[0]>0)
                {
                    if(nums[b]==0)
                    {
                        arr[0]--;
                    }
                    b++;

                }
                arr[0]++;
            }
            else
            {
                if(i-b+1 > c && arr[0]<=0)
                {
                    c=i-b+1;
                }
                else if(i-b > c)
                {
                    c=i-b;
                }
            }
        }
        if(a==c)
        {
            return a-1;
        }
    return c;
    }
}