class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int a=s.length();
        int left=0;
        int max=0;
        HashSet<Character> arr=new HashSet<>();
        for(int i=0;i<a;i++)
        {
            char ch=s.charAt(i);
            while(arr.contains(ch))
            {
                arr.remove(s.charAt(left));
                left++;
            }
            arr.add(ch);
            if(arr.size()>max)
            {
                max=arr.size();
            }   
        }
        return max;
    }
}