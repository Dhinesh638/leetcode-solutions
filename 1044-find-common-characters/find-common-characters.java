class Solution {
    public List<String> commonChars(String[] words) {

       int a=words.length;
       ArrayList<String> arr1=new ArrayList<>();
       StringBuilder [] arr=new StringBuilder[a];
       for(int i = 0; i < words.length; i++)
        {
        arr[i] = new StringBuilder(words[i]);
        }
       for(int i=0;i<arr[0].length();i++)
       {
        int c=1;
        char ch=arr[0].toString().charAt(i);
        int index=arr[0].indexOf(String.valueOf(ch));
        for(int j=1;j<a;j++)
        {
            if(arr[j].toString().contains(String.valueOf(ch)))
            {
                c++;
                int index1=arr[j].indexOf(String.valueOf(ch));
                arr[j].deleteCharAt(index1);
            }
            else
            {
                break;
            }
        }
        if(c==a)
        {
            arr1.add(String.valueOf(ch));
            arr[0].deleteCharAt(index);
            i--;
        }
       }
       return arr1;
    }
}