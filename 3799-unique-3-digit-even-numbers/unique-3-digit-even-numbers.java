class Solution {
    public int totalNumbers(int[] digits) {

        int a=digits.length;
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                for(int k=0;k<a;k++)
                {
                    if(i==j || j==k || i==k)
                    {
                        continue;
                    }
                    if(digits[i]==0 || digits[k]%2!=0)
                    {
                        continue;
                    }
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    arr.add(num);

                }
            }
        }
    return arr.size();
    }
}