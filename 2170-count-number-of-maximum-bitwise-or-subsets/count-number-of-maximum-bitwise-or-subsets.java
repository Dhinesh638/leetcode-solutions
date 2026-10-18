class Solution {
    int c=0;
    public void subset(int[] nums,int i,ArrayList<Integer> arr,int b)
    {
        if(i==nums.length)
        {
            int d=0;
            for(int j:arr)
            {
                d=d|j;
            }
            if(d==b)
            {
                c++;
            }
            return;
        }
        arr.add(nums[i]);
        subset(nums,i+1,arr,b);
        arr.remove(arr.size()-1);
        subset(nums,i+1,arr,b);
    }
    public int countMaxOrSubsets(int[] nums) {

        int a=nums.length;
        int b=0;
        c=0;
        for(int i=0;i<a;i++)
        {
            b=b|nums[i];
        }
        ArrayList<Integer> arr=new ArrayList<>();
        subset(nums,0,arr,b);
    return c;
    }
}