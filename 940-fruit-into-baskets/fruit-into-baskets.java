class Solution {
    public int totalFruit(int[] fruits) {

        int a=fruits.length;
        int b=0;
        int c=0;
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<a;i++)
        {
            arr.put(fruits[i],arr.getOrDefault(fruits[i],0)+1);
            while(arr.size()>2)
            {
                arr.put(fruits[b],arr.get(fruits[b])-1);
                if(arr.get(fruits[b])==0)
                {
                    arr.remove(fruits[b]);
                }
                b++;
            }
            if(i-b+1 > c)
            {
                c=i-b+1;
            }
        }
    return c;
    }
}