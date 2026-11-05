class Solution {
    public String minWindow(String s, String t) {
        
        int a=s.length();
        int b=t.length();
        if(b>a)
        {
            return "";
        }
        int[] arr=new int[128];
        int[] arr1=new int[128];
        for(int i=0;i<b;i++)
        {
            arr[t.charAt(i)]++;
            
        }
        int c=0;
        int d=Integer.MAX_VALUE;
        int left=0;
        int flag=0;
        StringBuilder arr2=new StringBuilder();
        for(int i=0;i<a;i++)
        {
            arr1[s.charAt(i)]++;
            if(arr1[s.charAt(i)]<=arr[s.charAt(i)])
            {
                c++;
            }
            while(c==b)
            {
                if(i-left+1 < d)
                {
                    d=i-left+1;
                    flag=left;
                }
                arr1[s.charAt(left)]--;
                if(arr1[s.charAt(left)] < arr[s.charAt(left)])
                {
                    c--;
                }
                left++;
            }
        }
        if(d==Integer.MAX_VALUE)
        {
            return "";
        } 
    return s.substring(flag,flag+d);
    }
}