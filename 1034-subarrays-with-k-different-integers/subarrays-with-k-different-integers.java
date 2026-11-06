class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return atmostk(nums,k)-atmostk(nums,k-1);
        
    }

    public int atmostk(int[] nums,int k)
    {
        int a=nums.length;
        int left=0;
        int c=0;
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<a;i++)
        {
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
            while(arr.size()>k)
            {
                arr.put(nums[left],arr.get(nums[left])-1);
                if(arr.get(nums[left])==0)
                {
                    arr.remove(nums[left]);
                }
                left++;
            }
            c=c+(i-left+1);
        }
    return c;
    }
}