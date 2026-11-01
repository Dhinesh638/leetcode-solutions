class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int a=arr.length;
        int b=0;
        int c=0;
        int d=0;
        for(int i=0;i<k;i++)
        {
            b=b+arr[i];
        }
        c=b/k;
        if(c>=threshold)
        {
            d++;
        }
        for(int i=k;i<a;i++)
        {
            b=b-arr[i-k];
            b=b+arr[i];
            c=b/k;
            if(c>=threshold)
            {
                d++;
            }
        }
    return d;
    }
}