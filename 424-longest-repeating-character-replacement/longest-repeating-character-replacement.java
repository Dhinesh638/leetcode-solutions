class Solution {
    public int characterReplacement(String s, int k) {
        
        int a=s.length();
        int[] arr=new int[26];
        int b=0;
        int c=0;
        int max=0;
        for(int i=0;i<a;i++)
        {
            char ch=s.charAt(i);
            arr[ch-'A']++;
            if(arr[ch-'A']>max)
            {
                max=arr[ch-'A'];
            }
            while((i-b+1)-max > k)
            {
                arr[s.charAt(b)-'A']--;
                b++;
            }
            if((i-b+1)>c)
            {
                c=i-b+1;
            }
        }
        
    return c;
    }
}