class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int a=nums.length;
        int[] arr=new int[2*a];
        int b=arr.length;
        for(int i=0;i<a;i++)
        {
            arr[i]=nums[i];
            arr[a+i]=nums[i];
        }
        return arr;
    }
}