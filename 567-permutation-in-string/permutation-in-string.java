class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int a=s1.length();
        int b=s2.length();
        if(a>b)
        {
            return false;
        }
        int[] arr=new int[26];
        int[] arr1=new int[26];
        int c=0;
        for(int i=0;i<a;i++)
        {
            arr[s1.charAt(i)-'a']++;
            arr1[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr,arr1))
        {
            return true;
        }
        for(int i=a;i<b;i++)
        {
            arr1[s2.charAt(i-a)-'a']--;
            arr1[s2.charAt(i)-'a']++;
            if(Arrays.equals(arr,arr1))
            {
                return true;
            }
        }
        return false;
    }
}