class Solution {
    public int passwordStrength(String password) {
        
        int a=password.length();
        int c=0;
        HashSet<Character> arr=new HashSet<>();
        for(int i=0;i<a;i++)
        {
            arr.add(password.charAt(i));
        }
        StringBuilder arr1=new StringBuilder();
        for(char ch:arr)
        {
            arr1.append(ch);
        }
        int b=arr1.length();
        for(int i=0;i<b;i++)
        {
            char ch=arr1.charAt(i);
            if(ch>='a' && ch<='z')
            {
                c=c+1;
            }
            else if(ch>='A' && ch<='Z')
            {
                c=c+2;
            }
            else if(ch>='0' && ch<='9')
            {
                c=c+3;
            }
            else
            {
                c=c+5;
            }
        }
    return c;
    }
}