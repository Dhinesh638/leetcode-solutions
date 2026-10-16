class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

        int a=logs.length;
        int[] arr=new int[k];
        HashMap<Integer,HashSet<Integer>> arr1=new HashMap<>();
        for(int i=0;i<a;i++)
        {
            int b=logs[i][0];
            int c=logs[i][1];
            arr1.putIfAbsent(b,new HashSet<>());
            arr1.get(b).add(c);
        }
        for(int d:arr1.keySet())
        {
            int c=arr1.get(d).size();
            arr[c-1]++;
        }
    return arr;
    }
}