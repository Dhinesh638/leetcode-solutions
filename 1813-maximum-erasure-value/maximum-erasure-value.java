class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        int a=nums.length;
        int b=0;
        int c=0;
        int d=0;
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<a;i++)
        {
            while(arr.contains(nums[i]))
            {
                c=c-nums[b];
                arr.remove(nums[b]);
                b++;
            }
            arr.add(nums[i]);
            c=c+nums[i];
            if(c>d)
            {
                d=c;
            }
        }
        return d;
    }
}