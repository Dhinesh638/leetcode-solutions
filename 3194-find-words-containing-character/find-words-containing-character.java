class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        int a=words.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<a;i++)
        {
            if(words[i].contains(String.valueOf(x)))
            {
                arr.add(i);
            }
        }
        return arr;
    }
}