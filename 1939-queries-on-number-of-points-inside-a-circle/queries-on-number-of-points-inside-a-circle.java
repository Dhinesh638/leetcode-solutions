class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {

        int a=queries.length;
        int b=points.length;
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            int c=queries[i][2]*queries[i][2];
            for(int j=0;j<b;j++)
            {
                int d=points[j][0]-queries[i][0];
                int e=points[j][1]-queries[i][1];
                int f=(d*d)+(e*e);
                if(f<=c)
                {
                    arr[i]++;
                }
            }
        }
    return arr;  
    }
}