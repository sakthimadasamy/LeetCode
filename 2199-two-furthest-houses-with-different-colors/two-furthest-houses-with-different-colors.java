class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length;i++)
        {
            int distance=0;
            for(int j=i+1;j<colors.length;j++)
            {
               
                if(colors[i]!=colors[j])
                {
                    distance=j-i;
                }
            }
            if(max<distance)
            {
                max=distance;
            }
        }
        return max;
    }
}