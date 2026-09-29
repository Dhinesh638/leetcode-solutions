// class Solution {
//     public int heightChecker(int[] heights) {
        
//         int a=heights.length;
//         int[] arr=Arrays.copyOf(heights,a);
//         Arrays.sort(arr);
//         int c=0;
//         for(int i=0;i<a;i++)
//         {
//             if(heights[i]!=arr[i])
//             {
//                 c++;
//             }
//         }
//         return c;
//     }
// }

class Solution {
    public int heightChecker(int[] heights) {

        int a=heights.length;
        int[] arr=Arrays.copyOf(heights,a);
        for(int i=0;i<a-1;i++)
        {
            boolean swap=false;
            for(int j=0;j<a-i-1;j++)
            {
                if(heights[j]>heights[j+1])
                {
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)
            {
                break;
            }
        }
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]!=heights[i])
            {
                c++;
            }
        }
        return c;
    }
}
