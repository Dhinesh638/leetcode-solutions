class Solution {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> arr=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        valid(arr,s,0,0,n);
        return arr;
    }
        
        public void valid(ArrayList<String> arr,StringBuilder s,int a,int b,int n)
        {
            if(s.length()==2*n)
            {
                arr.add(s.toString());
                return;
            }

            if(a<n)
            {
                valid(arr,new StringBuilder(s).append("("),a+1,b,n);
            }

            if(b<a)
            {
                valid(arr,new StringBuilder(s).append(")"),a,b+1,n);
            }
        }
}