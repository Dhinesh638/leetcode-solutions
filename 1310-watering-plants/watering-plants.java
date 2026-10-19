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
                c+=i;
                temp=capacity;
                c+=i+1;
                temp=temp-plants[i];  
            }
        }
    return c;
    }
}