class Solution {
    public int minOperations(int[] nums, int x) {

        int a=nums.length;
        int total=0;
        for(int i=0;i<a;i++)
        {
            total=total+nums[i];
        }
        if(x>total)
        {
            return -1;
        }
        int b=total-x;
        int sum=0;
        int c=0;
        int d=-1;
        for(int i=0;i<a;i++)
        {
            sum=sum+nums[i];
            while(sum>b)
            {
                sum=sum-nums[c];
                c++;
            }
            if(sum==b && i-c+1>d)
            {
                d=i-c+1;
            }
        }
        if(d==-1)
        {
            return -1;
        }
        int fin=a-d;
        return fin;
    }
}