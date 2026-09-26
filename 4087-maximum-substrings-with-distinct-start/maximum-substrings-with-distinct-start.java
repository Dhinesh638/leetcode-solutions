// class Solution {
//     public int maxDistinct(String s) {
        
//         int a=s.length();
//         HashSet<Character> arr=new HashSet<>();
//         for(int i=0;i<a;i++)
//         {
//             char ch=s.charAt(i);
//             arr.add(ch);
//         }
//         return arr.size();
//     }
// }

class Solution {
    public int maxDistinct(String s) {

        int a=s.length();
        int[] arr=new int[26];
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(++arr[(int)s.charAt(i)-'a']==1)
            {
                c++;
            }
        }
        return c;
    }
}
