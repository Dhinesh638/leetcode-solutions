class Solution {
    public int reverseDegree(String s) {

       int a=s.length();
       HashMap<Character,Integer> arr=new HashMap<>();
       int d=97;
       for(int i=26;i>=1;i--)
       {
        arr.put((char)(d),i);
        d++;
       }
       int b=1;
       int c=0;
       for(int i=0;i<a;i++)
       {
        char ch=s.charAt(i);
        int e=b*arr.get(ch);
        c=c+e;
        b++;
       }
       return c;
    }
}