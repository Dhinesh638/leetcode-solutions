// class Solution {
//     public int minMovesToSeat(int[] seats, int[] students) {
        
//         int a=seats.length;
//         int sum=0;
//         Arrays.sort(seats);
//         Arrays.sort(students);

//         for(int i=0;i<a;i++)
//         {
//             sum=sum+(Math.abs(seats[i]-students[i]));
//         }
//         return sum;
//     }
// }

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {

        int[] arr=new int[101];
        int a=seats.length;
        for(int i=0;i<a;i++)
        {
            arr[seats[i]]++;
            arr[students[i]]--;
        }

        int b=0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            b=b+Math.abs(c);
            c=c+arr[i];
        }
        return b;
    }
}
