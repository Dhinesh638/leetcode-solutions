// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//       int a=nums1.length;
//       int b=nums2.length;
//       HashSet<Integer> arr=new HashSet<>();
//       for(int i=0;i<a;i++)
//       {
//         for(int j=0;j<b;j++)
//         {
//             if(nums1[i]==nums2[j])
//             {
//                 arr.add(nums1[i]);
//                 break;
//             }
//         }
//       }
//       int c=arr.size();
//       int[] arr1=new int[c];
//       int d=0;
//       for(int i:arr)
//       {
//         arr1[d]=i;
//         d++;
//       }
//       return arr1;
//     }
// }

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int a=nums1.length;
        int b=nums2.length;
        HashSet<Integer> arr=new HashSet<>();
        HashSet<Integer> arr1=new HashSet<>();
        for(int i:nums1)
        {
            arr.add(i);
        }
        for(int i:nums2)
        {
            arr1.add(i);
        }
        HashSet<Integer> arr2=new HashSet<>();
        for(int i:arr)
        {
            for(int j:arr1)
            {
                if(i==j)
                {
                    arr2.add(i);
                    break;
                }
            }
        }
        int c=arr2.size();
        int[] arr3=new int[c];
        int d=0;
        for(int i:arr2)
        {
            arr3[d]=i;
            d++;
        }
    return arr3;
    }
}
