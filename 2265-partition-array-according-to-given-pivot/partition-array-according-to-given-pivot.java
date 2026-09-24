class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int a=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();
        for(int i=0;i<a;i++)
        {
            if(nums[i]<pivot)
            {
                arr.add(nums[i]);
            }
            else if(nums[i]>pivot)
            {
                arr1.add(nums[i]);
            }
            else
            {
                arr2.add(nums[i]);
            }
        }
        arr3.addAll(arr);
        arr3.addAll(arr2);
        arr3.addAll(arr1);
        int b=arr3.size();
        int[] arr4=new int[a];
        int i=0;
        for(int c:arr3)
        {
            arr4[i]=c;
            i++;
        }
        return arr4;
    }
}