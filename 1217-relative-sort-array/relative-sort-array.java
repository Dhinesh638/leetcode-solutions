// class Solution {
//     public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
//         int a=arr1.length;
//         int b=arr2.length;
//         int pos=0;
//         for(int i=0;i<b;i++)
//         {
//             int j=pos;
//             while(j<a)
//             {
//                 if(arr1[j]==arr2[i])
//                 {
//                     int temp=arr1[pos];
//                     arr1[pos]=arr1[j];
//                     arr1[j]=temp;

//                     if(j==pos)
//                     {
//                         pos++;
//                         j=pos;
//                     }
//                     else
//                     {
//                         pos++;
//                     }
//                 }
//                 else
//                 {
//                     j++;
//                 }
//             }             
//         }
//         for (int i = pos; i < a - 1; i++) {
//             for (int j = pos; j < a - 1 - (i - pos); j++) {

//                 if (arr1[j] > arr1[j + 1]) {
//                     int temp = arr1[j];
//                     arr1[j] = arr1[j + 1];
//                     arr1[j + 1] = temp;
//                 }
//             }
//         }
//         return arr1;
//     }
// }

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int a=arr1.length;
        int b=arr2.length;
        int k=0;
        int[] arr=new int[a];
        for(int i=0;i<b;i++)
        {
            int target=arr2[i];
            for(int j=0;j<a;j++)
            {
                if(target==arr1[j])
                {
                    arr[k]=arr1[j];
                    k++;
                }
            }
        }
        ArrayList<Integer> arr4=new ArrayList<>();  
        for(int c:arr1)
        {
            int d=0;
            for(int i=0;i<b;i++)
            {
                if(c==arr2[i])
                {
                    d++;
                    break;
                }
            }
            if(d==0)
            {
                arr4.add(c);
            }
        }
        Collections.sort(arr4);
        int j=0;
        for(int i=k;i<a;i++)
        {
            arr[i]=arr4.get(j);
            j++;
        }
    return arr;
    }
}
