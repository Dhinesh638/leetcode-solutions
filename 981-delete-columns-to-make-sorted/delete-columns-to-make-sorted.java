// class Solution {
//     public int minDeletionSize(String[] strs) {
        
//         int a=strs[0].length();
//         int d=0;
//         for(int i=0;i<a;i++)
//         {
//             char max=strs[0].charAt(i);
//             char min=strs[0].charAt(i);
//             int f=0;
//             int e=0;
//             for(int j=1;j<strs.length;j++)
//             {
//                 char ch=strs[j].charAt(i);
//                 if(ch>=max)
//                 {
//                     f=1;
//                     max=ch;
//                 }
//                 else if(ch<=min)
//                 {
//                     e=1;
//                     min=ch;
//                 }
//             }
//             if(f==1 && e==1)
//             {
//                 d++;
//             } 
//         }
//     return d;
//     }
// }

class Solution {
    public int minDeletionSize(String[] strs) {

        int a=strs[0].length();
        int d=0;
        for(int i=0;i<a;i++)
        {
            char max=strs[0].charAt(i);
            int c=1;
            for(int j=1;j<strs.length;j++)
            {
                char ch=strs[j].charAt(i);
                if(ch>=max)
                {
                    max=ch;
                    c++;
                }
            }
            if(c!=strs.length)
            {
                d++;
            } 
        }
        return d;
    }
}