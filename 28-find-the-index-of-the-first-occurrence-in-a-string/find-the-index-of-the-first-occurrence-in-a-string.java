class Solution {
    public int strStr(String haystack, String needle) {

        int a = haystack.length();
        int b = needle.length();
        if (b == 0)
            return 0;
        for (int i = 0; i <= a - b; i++) 
        {
            int j;
            for (j = 0; j < b; j++) 
            {
                if (haystack.charAt(i + j) != needle.charAt(j)) 
                {
                    break;
                }
            }
            if (j == b)
            {
                return i;
            }
        }
        return -1;
    }
}