 class Solution {
     public int[] arrayRankTransform(int[] arr) {

        int a=arr.length;
        int[] arr3=new int[1];
        arr3[0]=1;
        int[] arr1=Arrays.copyOf(arr,a);
        Arrays.sort(arr1);
        HashMap<Integer,Integer> arr2=new HashMap<>();
        int c=1;
        if(a==0)
        {
            return arr;
        }
        else if(a==1)
        {
            return arr3;
        }
        else
        {
        for(int i=1;i<a;i++)
        {
            if(arr1[i-1]<arr1[i])
            {
                arr2.put(arr1[i-1],c);
                c++;
            }
            else
            {
                arr2.put(arr1[i-1],c);
            }
        }
        if(arr1[a-2]<arr1[a-1])
        {
            arr2.put(arr1[a-1],c);
        }
        else
        {
            arr2.put(arr1[a-1],c);
        }
        for(int i=0;i<a;i++)
        {
            arr1[i]=arr2.get(arr[i]);
        }
        }
        return arr1;
    }
}
