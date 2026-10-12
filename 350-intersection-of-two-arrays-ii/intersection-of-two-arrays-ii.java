class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

      int a=nums1.length;
      int b=nums2.length;
      int c=0;
      int d=0;
      if(a<b)
      {
        c=a;
      }
      else
      {
        c=b;
      }
      if(c==a)
      {
        d=b;
      }
      else
      {
        d=a;
      }
      boolean[] arr2=new boolean[c];
      boolean[] arr3=new boolean[d];
      ArrayList<Integer> arr=new ArrayList<>();
      for(int i=0;i<c;i++)
      {
        for(int j=0;j<d;j++)
        {
            if(c==a)
            {
            if(nums1[i]==nums2[j] && arr3[j]==false)
            {
                arr.add(nums1[i]);
                arr3[j]=true;
                break;
            }
            }
            else
            {
                if(nums2[i]==nums1[j] && arr3[j]==false)
                {
                arr.add(nums2[i]);
                arr3[j]=true;
                break;
                }
            }
        }
      }
      int e=arr.size();
      int[] arr1=new int[e];
      int f=0;
      for(int i:arr)
      {
        arr1[f]=i;
        f++;
      }
      return arr1;
    }
}