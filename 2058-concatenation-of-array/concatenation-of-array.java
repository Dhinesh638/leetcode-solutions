class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int a=nums.length;
        int[] arr=new int[2*a];
        int b=arr.length;
        int j=0;
        // for(int i=0;i<a;i++)
        // {
        //     arr[i]=nums[i];
        //     arr[a+i]=nums[i];
        // }
        for(int i=0;i<b;i++)
        {
            if(i<a)
            {
            arr[i]=nums[j];
            j++;
            }
            else
            {
                if(j>a-1)
                {
                    j=0;
                }
                arr[i]=nums[j];
                j++;
            }
        }
        return arr;
    }
}