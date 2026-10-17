class Solution {
    public int[][] diagonalSort(int[][] mat) {

        int a=mat.length;
        int b=mat[0].length;
        int i=0;
            for(int j=0;j<b;j++)
            {
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(mat[i][j]);
                int m=i+1;
                for(int k=j+1;k<b && m<a;k++)
                {
                    arr.add(mat[m][k]);
                    m++;
                }
                Collections.sort(arr);
                int c=i;
                int d=j;
                for(int l:arr)
                {
                    mat[c][d]=l;
                    c++;
                    d++;
                }
            }  
        int e=0;
        for(int j=a-1;j>0;j--)
        {
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(mat[j][e]);
            int m=j+1;
            for(int k=e+1;k<b && m<a;k++)
            {
                arr.add(mat[m][k]);
                m++;
            }
            Collections.sort(arr);
            int c=j;
            int d=e;
            for(int q:arr)
            {
                mat[c][d]=q;
                c++;
                d++;
            }
        }
        return mat;
    }
}