// class Solution {
//     public void sortColors(int[] nums) {
//         int n=nums.length;
//         int[] num1=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             num1[i]=nums[i];
//         }
//         int k=0;
//         for(int j=0;j<3;j++)
//         {
//         int i=0;
//         while(i!=n)
//         {
//             if(num1[i]==j)
//             {
//                 nums[k]=num1[i];
//                 k++;
//             }
//          i++;   
//         }
//         }
//     }
// }

class Solution {
    public void sortColors(int[] nums) {

        int a=nums.length;
        for(int i=0;i<a;i++)
        {
            boolean swap=false;
            for(int j=0;j<a-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                swap=true;
                }
            }
            if(!swap)
            {
                break;
            }
        }
    }
}
