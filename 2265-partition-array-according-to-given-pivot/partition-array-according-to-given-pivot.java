class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int a =nums.length;
        int[] arr=new int[a];
        int b=0;
        int c=0;
        int d=0;
        int j=0;
        for(int i=0;i<a;i++)
        {
            if(nums[i]<pivot)
            {
                arr[j]=nums[i];
                j++;
                b++;
            }
            else if(nums[i]==pivot)
            {
                c++;
            }
            else
            {
                d++;
            }
        }
        int temp=b;
        for(int i=0;i<c;i++)
        {
            arr[temp]=pivot;
            temp++;
        }
        int temp1=temp;
        for(int i=0;i<a;i++)
        {
            if(nums[i]>pivot)
            {
            arr[temp1]=nums[i];
            temp1++;
            }
        }
        return arr;
    }
}