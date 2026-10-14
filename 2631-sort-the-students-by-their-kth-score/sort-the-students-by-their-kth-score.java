class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {

        int a=score.length;
        int b=score[0].length;
        Integer[] arr=new Integer[a];
        int[][] arr1=new int[a][b];
        for(int j=0;j<a;j++)
        {
            arr[j]=score[j][k];
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
            if(arr[i]==score[j][k])
            {
                for(int l=0;l<b;l++)
                {
                    arr1[i][l]=score[j][l];
                }
            }
            }  
        }
        return arr1;
        
    }
}