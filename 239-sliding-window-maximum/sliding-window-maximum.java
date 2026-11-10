class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int a=nums.length;
        int[] arr=new int[a-k+1];
        Deque<Integer> arr1=new ArrayDeque<>();
        for(int i=0;i<a;i++)
        {
            while(!arr1.isEmpty() && arr1.peekFirst() <= i-k)
            {
                arr1.removeFirst();
            }

            while(!arr1.isEmpty() && nums[arr1.peekLast()] <= nums[i])
            {
                arr1.removeLast();
            }
            arr1.addLast(i);
            if(i>=k-1)
            {
                arr[i-k+1]=nums[arr1.peekFirst()];
            }
        }  
    return arr;      
    }
}