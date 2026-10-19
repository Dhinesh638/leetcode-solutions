class Solution {
    public int wateringPlants(int[] plants, int capacity) {

        int a=plants.length;
        int temp=capacity;
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(temp>=plants[i])
            {
                c++;
                temp=temp-plants[i];
            }
            else
            {
                for(int j=i;j>0;j--)
                {
                    c++;
                }
                temp=capacity;
                for(int k=0;k<=i;k++)
                {
                    c++;
                }
                temp=temp-plants[i];  
            }
        }
    return c;
    }
}