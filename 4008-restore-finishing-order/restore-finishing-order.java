class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        int a=order.length;
        int b=friends.length;
        int[] arr=new int[b];
        int k=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(order[i]==friends[j])
                {
                    arr[k]=order[i];
                    k++;
                }
            }
        }
        return arr;
    }
}