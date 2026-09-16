class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        

        int a=words.length;
        HashMap<Integer,Character> arr=new HashMap<>();
        for(int i=0;i<26;i++)
        {
            arr.put(i,(char)('z'- i));
        }
        int b=weights.length;
        HashMap<Character,Integer> arr1=new HashMap<>();
        for(int i=0;i<weights.length;i++)
        {
            arr1.put((char)(i+'a'),weights[i]);
        }
        String s="";
        for(int i=0;i<a;i++)
        {
            int sum=0;
            for(int j=0;j<words[i].length();j++)
            {
                char ch=words[i].charAt(j);
                sum=sum+arr1.get(ch);
            }
            int c=sum%26;
            s=s+arr.get(c);
        }
        return s;
    }
}
