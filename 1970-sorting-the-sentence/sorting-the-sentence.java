// class Solution {
//     public String sortSentence(String s) {
        
//         int a=s.length();
//         ArrayList<Character> arr=new ArrayList<>();
//         StringBuilder arr1=new StringBuilder();
//         int flag=0;
//         int flag1=0;
//         for(int i=1;i<=9;i++)
//         {
//             arr.add((char)('0' + i));
//         }
//         for(char b:arr)
//         {
//             flag=0;
//             for(int i=0;i<a;i++)
//             {
//                 char ch=s.charAt(i);
//                 if(ch==b)
//                 {
//                     int c=i-1;
//                     for(int j=c;j>=0;j--)
//                     {
//                         char ch1=s.charAt(j);
//                         if(ch1==' ')
//                         {
//                             flag=1;
//                             if(arr1.length() > 0)
//                             {
//                                 arr1.append(' ');
//                             }
//                             for(int k=j+1;k<=c;k++)
//                             {
//                                 char ch2=s.charAt(k);
//                                 arr1.append(ch2);
//                             }
//                             break;
//                         }
//                     }
//                     if(flag==0)
//                     {
//                         if(arr1.length() > 0)
//                         {
//                             arr1.append(' ');
//                         }
//                         for(int k=0;k<=c;k++)
//                         {
//                             char ch3=s.charAt(k);
//                             arr1.append(ch3);
//                         }
//                         break;
//                     }
//                 }
//             }
//         }
//         return arr1.toString();
//     }
// }

class Solution {
    public String sortSentence(String s) {
        
        String[] arr1=s.split(" ");
        int a=arr1.length;
        StringBuilder[] arr=new StringBuilder[a];
        for(int i=0;i<a-1;i++)
        {
            boolean swap=false;
            for(int j=0;j<a-i-1;j++)
            {
            int b=arr1[j].charAt(arr1[j].length()-1)-'0';
            int c=arr1[j+1].charAt(arr1[j+1].length()-1)-'0';
            if(b>c)
            {
                String temp=arr1[j];
                arr1[j]=arr1[j+1];
                arr1[j+1]=temp;
                swap=true;
            }
            }
            if(!swap)
            {
                break;
            }
        }
        for(int i=0;i<a;i++)
        {
            arr[i]=new StringBuilder();
            arr[i].append(arr1[i]);
        }
        StringBuilder arr2=new StringBuilder();
        for(int i=0;i<a;i++)
        {
            arr2.append(arr[i]);
            if(i!=a-1)
            {
                arr2.append(" ");
            }
        }
        for(int i=arr2.length()-1;i>=0;i--)
        {
            char ch=arr2.charAt(i);
            if(i==arr2.length()-1)
            {
                arr2.deleteCharAt(i);
                i--;
            }
            else if(ch==' ')
            {
                arr2.deleteCharAt(i-1);
                i--;
            }
        }
        return arr2.toString();
    }
}