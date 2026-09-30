// class Solution {
//     public int[] sortArray(int[] nums) {

//         int a=nums.length;
//         for(int i=0;i<a-1;i++)
//         {
//             boolean swap=false;
//             for(int j=0;j<a-i-1;j++)
//             {
//                 if(nums[j]>nums[j+1])
//                 {
//                     int temp=nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=temp;
//                     swap=true;
//                 }
//             }
//             if(!swap)
//             {
//                 break;
//             }
//         }
//         return nums;
//     }
// }

class Solution {
    public int[] sortArray(int[] nums) {

        int a=nums.length;
        int[] arr=new int[2*50000+1];
        for(int n:nums)
        {
            arr[n+50000]++;
        }
        int b=0;
        for(int i=0;i<arr.length;i++)
        {
            int fre=arr[i];
            while(fre!=0)
            {
                nums[b]=i-50000;
                fre--;
                b++;
            }
        }
        return nums;
    }
}
