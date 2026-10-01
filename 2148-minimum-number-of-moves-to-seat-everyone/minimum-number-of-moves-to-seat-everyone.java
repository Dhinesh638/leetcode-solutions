class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        
        int a=seats.length;
        int sum=0;
        // int sum1=0;
        // for(int i=0;i<a;i++)
        // {
        //     sum=sum+seats[i];
        // }
        // for(int i=0;i<a;i++)
        // {
        //     sum1=sum1+students[i];
        // }
        // return Math.abs(sum1-sum);

        Arrays.sort(seats);
        Arrays.sort(students);

        for(int i=0;i<a;i++)
        {
            sum=sum+(Math.abs(seats[i]-students[i]));
        }
        return sum;
    }
}