// class Solution {
//     public int[] minOperations(String boxes) {
        
//         int a=boxes.length();
//         ArrayList<Integer> arr=new ArrayList<>();
//         int[] arr1=new int[a];
//         for(int i=0;i<a;i++)
//         {
//             char ch=boxes.charAt(i);
//             if(ch=='1')
//             {
//                 arr.add(i);
//             }
//         }
//         for(int i=0;i<a;i++)
//         {
//             int e=0;
//             for(int c:arr)
//             {
//                 int d=Math.abs(c-i);
//                 e=e+d;
//             }
//             arr1[i]=e;
//         }
//         return arr1;
//     }
// }

class Solution {
    public int[] minOperations(String boxes) {

        int a=boxes.length();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                char ch=boxes.charAt(j);
                if(ch=='1')
                {
                    arr[i]=arr[i]+Math.abs(i-j);
                }
            }
        }
        return arr;
    }
}
