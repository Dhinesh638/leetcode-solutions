class Solution {
    public int digitFrequencyScore(int n) {

        HashMap<Integer,Integer> arr=new HashMap<>();
        int sum=0;
        while(n!=0)
        {
            int a=n%10;
            arr.put(a,arr.getOrDefault(a,0)+1);
            n=n/10;
        }
        for(Map.Entry<Integer,Integer> i:arr.entrySet())
        {
            int b=i.getKey();
            int c=i.getValue();
            int d=b*c;
            sum=sum+d;
        }
    return sum;
    }
}