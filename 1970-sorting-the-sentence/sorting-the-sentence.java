class Solution {
    public String sortSentence(String s) {
        
        int a=s.length();
        ArrayList<Character> arr=new ArrayList<>();
        StringBuilder arr1=new StringBuilder();
        int flag=0;
        int flag1=0;
        for(int i=1;i<=9;i++)
        {
            arr.add((char)('0' + i));
        }
        for(char b:arr)
        {
            flag=0;
            for(int i=0;i<a;i++)
            {
                char ch=s.charAt(i);
                if(ch==b)
                {
                    int c=i-1;
                    for(int j=c;j>=0;j--)
                    {
                        char ch1=s.charAt(j);
                        if(ch1==' ')
                        {
                            flag=1;
                            if(arr1.length() > 0)
                            {
                                arr1.append(' ');
                            }
                            for(int k=j+1;k<=c;k++)
                            {
                                char ch2=s.charAt(k);
                                arr1.append(ch2);
                            }
                            break;
                        }
                    }
                    if(flag==0)
                    {
                        if(arr1.length() > 0)
                        {
                            arr1.append(' ');
                        }
                        for(int k=0;k<=c;k++)
                        {
                            char ch3=s.charAt(k);
                            arr1.append(ch3);
                        }
                        break;
                    }
                }
            }
        }
        return arr1.toString();
    }
}