class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int a=s.length();
        HashMap<Character,Integer> arr=new HashMap<>();
        char ch='a';
        for(int i=0;i<26;i++)
        {
            arr.put(ch,widths[i]);
            ch++;
        }
        int sum=0;
        int c=0;
        for(int i=0;i<a;i++)
        {
            char ch1=s.charAt(i);
            if((sum+arr.get(ch1))<=100)
            {
                sum=sum+arr.get(ch1);
            }
            else
            {
                c++;
                sum=0;
                sum=sum+arr.get(ch1);
            }
        }
        int[] arr1=new int[2];
        arr1[0]=c+1;
        arr1[1]=sum;
        return arr1;
        
    }
}