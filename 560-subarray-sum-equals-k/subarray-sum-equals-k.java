// class Solution {
//     public int subarraySum(int[] nums, int k) {
        
//         int a=nums.length;
//         int sum=0;
//         int c=0;
//         for(int i=0;i<a;i++)
//         {
//             for(int j=i;j<a;j++)
//             {
//                 sum=sum+nums[j];
//                 if(sum==k)
//                 {
//                     c++;
//                 }
//             }
//             sum=0;
//         }
//         return c;
//     }
// }

class Solution {
    public int subarraySum(int[] nums, int k) {

        int a=nums.length;
        HashMap<Integer,Integer> arr=new HashMap<>();
        int b=0;
        int c=0;
        arr.put(0,1);
        for(int i:nums)
        {
            b=b+i;
            c=c+arr.getOrDefault(b-k,0);
            arr.put(b,arr.getOrDefault(b,0)+1);
        }
        return c;
    }
}
