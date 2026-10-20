class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int a=nums.length;
        int[] arr=new int[a];
        int prefix=1;
        for(int i=0;i<a;i++)
        {
            arr[i]=prefix;
            prefix=prefix*nums[i];
        }

        int suffix=1;
        for(int i=a-1;i>=0;i--)
        {
            arr[i]=arr[i]*suffix;
            suffix=suffix*nums[i];
        }
        return arr;
    }
}