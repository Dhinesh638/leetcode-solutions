class Solution {
    public int[] findDegrees(int[][] matrix) {
        
        int a=matrix.length;
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            int c=0;
            for(int j=0;j<a;j++)
            {
                if(matrix[i][j]==1)
                {
                    c++;
                }
            }
            arr[i]=c;
        }
        return arr;
    }
}