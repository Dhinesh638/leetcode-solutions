class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {

        int a=nums.length;
        int c=0;
        for(int i=0;i<a;i++)
        {
            int num=nums[i];
            while(num!=0)
            {
                int b=num%10;
                if(b==digit)
                {
                    c++;
                }
                num=num/10;
            }
        }
    return c;  
    }
}