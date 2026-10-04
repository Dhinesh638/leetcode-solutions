// class Solution {
//     public int longestValidParentheses(String s) {
        
//         int a=s.length();
//         int c=0;
//         int d=0;
//         int e=0;
//         int f=0;
//         for(int i=0;i<a;i++)
//         {
//             for(int j=i;j<a;j++)
//             {
//                 c=0;
//                 e=0;
//                 for(int k=i;k<=j;k++)
//                 {
//                     if(s.charAt(k)=='(')
//                     {
//                         e++;
//                         c++;
//                     }
//                     else if(s.charAt(k)==')')
//                     {
//                         e++;
//                         if(c>0)
//                         {
//                             c--;
//                         }
//                         else
//                         {
//                             c--;
//                             break;
//                         }
//                     }
//                 }
//                 if(c==0)
//                 {
//                     if(e>f)
//                     {
//                         f=e;
//                     }
//                 }
//             }
//         }
//         return f;
//     }
// }

class Solution {
       public int longestValidParentheses(String s) 
    {

        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int max = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '(') 
            {
                st.push(i);
            } 
            else 
            {
                st.pop();

                if (st.isEmpty()) 
                {
                    st.push(i);
                } 
                else 
                {
                    max = Math.max(max, i - st.peek());
                }
            }
        }

        return max;
    }
}

      
