class Solution {
    public int[] diStringMatch(String s) {

        int a=s.length();
        int[] arr=new int[a+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;
        }
        int[] arr1=new int[a+1];
        int n=arr1.length;
        int j=0;
        int k=a;
        int l=0;
        for(int i=0;i<a;i++)
        {
            char ch=s.charAt(i);
            if(ch=='I')
            {
                if(arr[j]<arr[j+1])
                {
                    arr1[j]=l;
                    l++;
                }
                j++;
                
            }
            else
            {
                if(arr[j]<arr[j+1])
                {
                    arr1[j]=k;
                    k--;
                }
                j++;
            }
        }
        if(s.charAt(a-1)=='D')
        {
            arr1[n-1]=k;
        }
        else
        {
            arr1[n-1]=l;
        }
        
    return arr1; 
    }
}