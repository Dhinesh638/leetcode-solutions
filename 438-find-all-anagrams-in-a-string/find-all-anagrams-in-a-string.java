class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int a=s.length();
        int b=p.length();
        ArrayList<Integer> arr=new ArrayList<>();
        if(b>a)
        {
            return arr;
        }
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<b;i++)
        {
            arr1[p.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2))
        {
            arr.add(0);
        }
        for(int i=b;i<a;i++)
        {
            arr2[s.charAt(i-b)-'a']--;
            arr2[s.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2))
            {
                arr.add(i-b+1);
            }
        }
        return arr;
    }
}