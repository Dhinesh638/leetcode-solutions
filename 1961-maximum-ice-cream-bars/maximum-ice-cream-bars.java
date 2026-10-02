// class Solution {
//     public int maxIceCream(int[] costs, int coins) {

//         int[] arr=new int[(2*50000)+1];
//         int a=costs.length;
//         int c=0;
//         for(int i=0;i<a;i++)
//         {
//             arr[costs[i]]++;
//         }
//         int sum=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             int j=arr[i];
//             while(j!=0)
//             {
//                 if(sum+i<=coins)
//                 {
//                     sum=sum+i;
//                     c++;
//                 }
//                 else
//                 {
//                     return c;
//                 }
//                 j--;
//             }
//         }
//         return c;
//     }
// }


class Solution {
    public int maxIceCream(int[] costs, int coins) {

        int a=costs.length;
        int sum=0;
        int c=0;
        Arrays.sort(costs);
        for(int i=0;i<a;i++)
        {
            if(sum+costs[i]<=coins)
            {
                sum=sum+costs[i];
                c++;
            }
            else
            {
                return c;
            }
        }
        return c;
    }
}
