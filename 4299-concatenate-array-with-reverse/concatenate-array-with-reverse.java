class Solution {
    public int[] concatWithReverse(int[] nums) {
        
        int a=nums.length;
        int[] arr=new int[2*a];
        int b=2*a;
        int j=0;
        for(int i=0;i<b;i++)
        {
            if(i<a)
            {
                arr[i]=nums[j];
                j++;
            }
            else
            {
                j--;
                arr[i]=nums[j];
            }
        }
        return arr;
    }
}