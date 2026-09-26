class Solution {
    public int maxDistinct(String s) {
        
        int a=s.length();
        HashSet<Character> arr=new HashSet<>();
        for(int i=0;i<a;i++)
        {
            char ch=s.charAt(i);
            arr.add(ch);
        }
        return arr.size();
    }
}