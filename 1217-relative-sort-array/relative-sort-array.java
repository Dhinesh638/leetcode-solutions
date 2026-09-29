class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int a=arr1.length;
        int b=arr2.length;
        int pos=0;
        for(int i=0;i<b;i++)
        {
            int j=pos;
            while(j<a)
            {
                if(arr1[j]==arr2[i])
                {
                    int temp=arr1[pos];
                    arr1[pos]=arr1[j];
                    arr1[j]=temp;

                    if(j==pos)
                    {
                        pos++;
                        j=pos;
                    }
                    else
                    {
                        pos++;
                    }
                }
                else
                {
                    j++;
                }
            }             
        }
        // HashSet<Integer> arr3=new HashSet<>();
        // for(int i=0;i<a;i++)
        // {
        //     arr3.add(arr1[i]);
        // }
        // int d=arr3.size();
        // int c=Math.abs(d-b);
        // for(int i=a-1;i>=a-c;i--)
        // {
        //     for(int j=a-1;j>=a-c-i-1;j--)
        //     {
        //         if(arr1[j]>arr1[j-1])
        //         {
        //             int temp=arr1[j];
        //             arr1[j]=arr1[j-1];
        //             arr1[j-1]=temp;
        //         }
        //     }
        // }
        for (int i = pos; i < a - 1; i++) {
            for (int j = pos; j < a - 1 - (i - pos); j++) {

                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        return arr1;
    }
}