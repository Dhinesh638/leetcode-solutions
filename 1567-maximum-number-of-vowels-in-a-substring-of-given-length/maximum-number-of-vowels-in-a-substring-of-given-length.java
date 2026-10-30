class Solution {
    public int maxVowels(String s, int k) {

        int a=s.length();
        int b=0;
        int c=0;
        for(int i=0;i<k;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                c++;
            }
        }
        if(c>b)
        {
            b=c;
        }
        for(int i=k;i<a;i++)
        {
            char ch1=s.charAt(i-k);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
            {
                c--;
            }
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                c++;
            }
            if(c>b)
            {
                b=c;
            }
        }
        return b;
    }
}