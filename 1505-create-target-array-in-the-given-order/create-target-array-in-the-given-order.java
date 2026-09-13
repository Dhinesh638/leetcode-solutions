class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int a=nums.length;
        int[] arr=new int[a];
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(arr[index[i]]==0 && nums[i]!=0)
            {
            arr[index[i]]=nums[i];
            }
            else
            {
                for(int j=a-1;j>index[i];j--)
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                arr[index[i]]=nums[i];
            }
        } 
        return arr;
    }
}