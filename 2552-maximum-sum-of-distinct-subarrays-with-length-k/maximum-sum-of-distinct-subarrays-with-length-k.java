class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        int a=nums.length;
        int b=0;
        long c=0;
        long d=0;
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
            c=c+nums[i];
        }
        if(arr.size()==k)
        {
            d=c;
        }
        for(int i=k;i<a;i++)
        {
            arr.put(nums[i-k],arr.get(nums[i-k])-1);
            if(arr.get(nums[i-k])==0)
            {
                arr.remove(nums[i-k]);
            }
            c=c-nums[i-k];
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
            c=c+nums[i];
            if(arr.size()==k)
            {
                if(c>d)
                {
                    d=c;
                }
            }
        }
        return d;
    }
}