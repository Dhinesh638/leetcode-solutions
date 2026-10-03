class Solution {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> arr=new ArrayList<>();
        valid(arr,"",0,0,n);
        return arr;
    }
        
        public void valid(ArrayList<String> arr,String s,int a,int b,int n)
        {
            if(s.length()==2*n)
            {
                arr.add(s);
                return;
            }

            if(a<n)
            {
                valid(arr,s+"(",a+1,b,n);
            }

            if(b<a)
            {
                valid(arr,s+")",a,b+1,n);
            }
        }
}