class Solution {
    public int sumOfSquares(int[] nums) {
        
        int a=nums.length;
        int sum=0;
        int c=1;
        for(int i=0;i<a;i++)
        {
            if(a%c==0)
            {
                int b=nums[i]*nums[i];
                sum=sum+b;
            }
            c++;
        }
        return sum;
    }
}